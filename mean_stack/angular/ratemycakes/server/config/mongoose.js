var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/rate_my_cakes');
mongoose.Promise = global.Promise;