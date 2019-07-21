var mongoose = require('mongoose');
const ReviewSchema = new mongoose.Schema({
    rating: Number,
    comment: String,
    id: String, 
     
    }, {timestamps:true});
    mongoose.model('Review', ReviewSchema);
    const Review = mongoose.model('Review');


var mongoose = require('mongoose');
const CakesSchema = new mongoose.Schema({
    name: String,
    url: String,
    reviews: {
        type:[ReviewSchema]
    }
    

  
   }, {timestamps:true});
   mongoose.model('Cakes', CakesSchema);
   const Cakes = mongoose.model('Cakes');






