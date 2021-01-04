package maxonline.korge


import com.soywiz.kds.iterators.fastForEach
import com.soywiz.klock.*
import com.soywiz.kmem.clamp
import com.soywiz.korge.baseview.BaseView
import com.soywiz.korge.component.UpdateComponent
import com.soywiz.korge.component.attach
import com.soywiz.korge.tween.V2
import com.soywiz.korma.interpolation.Easing

class ConstantTween(
    override val view: BaseView,
    var variables: List<V2<*>>,
    time: TimeSpan,
    val easing: Easing,
) : UpdateComponent {
    var elapsed = 0.0.milliseconds
    var maxTime = if (time != TimeSpan.NIL) time else (variables.map { it.endTime.nanoseconds }.max() ?: 0.0).nanoseconds
    var done = false

    init {
        variables.fastForEach { v ->
            v.init()
        }
        update(0.0.milliseconds)
    }

    fun newVariables(vararg variables: V2<*>, time: TimeSpan){
        update(maxTime)
        this.variables = variables.toList()
        variables.fastForEach { v ->
            v.init()
        }
        maxTime = if (time != TimeSpan.NIL) time else (variables.map { it.endTime.nanoseconds }.max() ?: 0.0).nanoseconds
        done = false
        elapsed =  0.0.milliseconds
    }

    override fun update(dt: TimeSpan) {
        if (done) {
            return
        }

        elapsed += dt

        val ratio = (elapsed / maxTime).clamp(0.0, 1.0)
        setTo(elapsed)

        //println("r: " + ratio + " e: " + elapsed +  " maxtime " + maxTime + " dt: " + dt )

        if (ratio >= 1.0) {
            done = true
        }
    }

    fun setTo(elapsed: TimeSpan) {
        variables.fastForEach { v ->
            val durationInTween = v.duration.coalesce { (maxTime - v.startTime) }
            val elapsedInTween = (elapsed - v.startTime).clamp(0.0.milliseconds, durationInTween)
            val ratioInTween =
                if (durationInTween <= 0.0.milliseconds || elapsedInTween >= durationInTween) 1.0 else elapsedInTween / durationInTween
            val easedRatioInTween = easing(ratioInTween)
            v.set(easedRatioInTween)
        }
    }

    override fun toString(): String = "TweenComponent($view)"
}


fun BaseView.constantTween(
    vararg vs: V2<*>,
    time: TimeSpan = 1.seconds,
    easing: Easing = Easing.LINEAR,
): ConstantTween {
    val noCoroutineTweenComponent = ConstantTween(this, vs.toList(), time, easing).also { it.attach() }
    return noCoroutineTweenComponent
}
