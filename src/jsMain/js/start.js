console.log("start.js executed")

function sayHiFromJs() {
    console.log("Hello World from js");
    require('myModule').sayHiFromKotlin();
}

