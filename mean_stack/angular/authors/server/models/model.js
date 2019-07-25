var mongoose = require('mongoose');
const AuthorSchema = new mongoose.Schema({
  name: {
    type: String,
    required: [true, "Author's name must be longer than 3 characters"],
    minlength: [3, "must be above 3 characters"]
   } 
  },{timestamps:true});
  

   mongoose.model('Author', AuthorSchema);
   const Author = mongoose.model('Author');
