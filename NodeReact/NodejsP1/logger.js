var url = 'http://mylogger.in/log';

function log(message){
    //send an http request

    console.log(message);
}

const _log = log;
export { _log as log };
