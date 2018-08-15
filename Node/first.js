function sayHello(msg) {
    console.log("Hello, the message is:" + msg);
    console.log(global.console.log("test"));
    console.log(module);
}

sayHello("my first node code");

const logger = require('./logger');
logger = 1;
logger.log("using module export and require");