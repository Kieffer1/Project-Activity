const express = require('express');
const app = express();
// body parser module 
const bodyParser = require('body-parser');
const conn = require('./conn');

app.set("view engine", "ejs");

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));
app.use(express.static("public"));

app.post('/addstudent', (req, res) => {
    const id = 0;
    const idNum = req.body.idnum;
    const fullName = req.body.fullname;
    const email = req.body.email;
    // console.log(`ID Number: ${idNum} FullName: ${fullName} Email: ${email}`);
    const query = `INSERT INTO students VALUES ("${id}", "${idNum}", "${fullName}", "${email}")`;
    conn.query(query, (err, result) => {
        if(err) throw err;

        
        res.send(`
            <script>
                alert("1 Student added Successfully");
                window.location.href="/";
            </script>
        `);

    })

    conn.end();
})
app.get('/', (req, res) => {
    const getData = "SELECT * FROM students";
    conn.query(getData, (err, data) => {
        if(err) throw err;

        res.render('index', {
            title: "Ren Gwapo",
            action: "list",
            sampledata: data
        });
    })

})

app.listen(3000, () => {
    console.log("listening at port 3000");
})