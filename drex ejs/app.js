const express = require('express');
const app = express();

app.set('view engine','ejs');
app.use(express.static("views"));

app.get('/', (req,res)=>{
    res.render('index',{title: "My Ejs Project"});
});

app.listen(3011, ()=>{
    console.log('listening to port 3011')
});