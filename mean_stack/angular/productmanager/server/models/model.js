var mongoose = require('mongoose');
const ProductSchema = new mongoose.Schema({
    title: {
      type:String,
      required: [true, "Title must be longer than 4 characters"],
      minlength: [4, "must be above 4 characters"]
    },
    price: Number,
    url: String,
   
  
   }, {timestamps:true});
   mongoose.model('Products', ProductSchema);
   const Products = mongoose.model('Products');
