const mysql = require("mysql");
const express = require("express");
const bodyParser = require("body-parser");

var app = express();
app.use(bodyParser.json());

var mysqlConnection = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "Eminem@12",
    database: "test1",
    multipleStatements: true
});

mysqlConnection.connect((err) => {
    if (err) console.log("Connection Failed." + err);
    else console.log("Connection Established Successfully!");
});

app.listen(3000);