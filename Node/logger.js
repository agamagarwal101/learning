var url = 'http://mylogger.io/log';

function log(msg) {
    // Send the http request
    console.log(msg);
}

module.exports.log = log;