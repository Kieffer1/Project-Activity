const express = require('express');
const app = express();

app.get('/', (req,res)=>{
    res.send("Helo World!!! ");
});

app.listen(3001, ()=>{
    console.log("Listening to port 3001!...");
});