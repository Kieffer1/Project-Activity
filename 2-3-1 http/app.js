const http = require('http')

const server = http.createServer((req,res) => {
    res.write("Lalaki po si chowlong!\n");
    res.write("Pagkakalameg");
    res.end()
})

server.listen(3002, () => {
    console.log("Listening to port 3002");
})