const express = require('express');
// body parser module 
const bodyParser = require('body-parser');
const app = express();

app.set("view engine", "ejs");

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));
app.use(express.static("public"));

app.post('/addstudent', (req, res) => {
    const idNum = req.body.idnum;
    const fullName = req.body.fullname;
    const email = req.body.email;
    console.log(`ID Number: ${idNum} FullName: ${fullName} Email: ${email}`);

})
app.get('/', (req, res) => {
    res.render('index');
})

app.listen(3000, () => {
    console.log("listening at port 3000");
})