var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/product_manager');
mongoose.Promise = global.Promise;