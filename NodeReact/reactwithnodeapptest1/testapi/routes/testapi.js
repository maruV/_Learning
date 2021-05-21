const express = require('express');
const cors = require('cors');

var app = express();

const router = express.Router();

router.get('/', async (req, res, next) => {
    res.send("API test successful.")
});

module.exports = router;