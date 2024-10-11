const mysql = require('mysql');

const conn = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "profiling2"
});

conn.connect((err) => {
    if(err) throw err;
    console.log("server is connected");
})

module.exports = conn;
