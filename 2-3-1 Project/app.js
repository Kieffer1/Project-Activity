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
    const idNum = req.body.idNumber;
    const fullName = req.body.fullName;
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
        `)
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
app.get('/delete/:id', (req, res) => {
    const del_id = req.params.id;

    const toDelete = `DELETE FROM students WHERE id = "${del_id}"`;

    conn.query(toDelete, (err, result) => {
        if(err) throw err;

        res.send(`
            <script>
                alert("1 student deleted");
                window.location.href="/";
            </script>
        `)
    })
})

app.post('/updatestudent/:id', (req, res) => {
    const up_id = req.params.id;

    const idNumber = req.body.idNumber;
    const fullName = req.body.fullName;
    const email = req.body.email;

    const update = `UPDATE students SET idNumber = "${idNumber}", fullName = "${fullName}", email = "${email}" WHERE id = "${up_id}"`;

    conn.query(update, (err, result) => {
        if (err) throw err;

        res.send(`
            <script>
                alert("1 student updated");
                window.location.href="/";
            </script>
        `)
    })
})

app.listen(3000, () => {
    console.log("listening at port 3000");
})