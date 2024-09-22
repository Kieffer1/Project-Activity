const express = require('express')

const app = express()

app.set('view engine', 'ejs')
//for static file like css, img, js assets
app.use(express.static("public"))

app.get('/', (req,res)=>{
    //res.send("Hello Ren...")
    res.render('index', {title: "My EJS Project"})
})

app.get('/about', (req,res)=>{
    res.send("about page")
})

app.listen(3003,  ()=>{
    console.log("Listening at port 3000....")
})