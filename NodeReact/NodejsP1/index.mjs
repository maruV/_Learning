import http from 'http';

 const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.write('Pappan!!!!');
        res.end();
    }    

    if (req.url === '/api/courses') {
        res.write(JSON.stringify(['pappan', 'tettan', 'hengan']));
        res.end();
    }
 });

 server.listen(3000);

console.log('Listening on port 3000...');