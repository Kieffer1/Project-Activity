const express = require('express');
const app = express();

app.get('/',(req, res)=>{
    res.send("BINI");
});

app.listen(3000, ()=> {
    console.log("Listening at port 3000....");

});