var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/Author');
mongoose.Promise = global.Promise;