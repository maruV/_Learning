const EventEmitter = require('events');
const emitter = new EventEmitter();

emitter.addListener('messageLogged', (e) =>{
    console.log('Listener called', e);
});

emitter.emit('messageLogged', {a:'saup!', b:'http:'});

emitter.on('Logging', (e) => {
    console.log('Heres your message', e);
});

emitter.emit('Logging', 'Trying to login');