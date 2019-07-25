var mongoose = require('mongoose');
const Author = mongoose.model('Author');
// var UserSchema = new mongoose.Schema({
//     name: String,
//     quote: String,
//     created_at: Date,
//    })
// mongoose.model('User', UserSchema);
module.exports = {
    index: function(req, res) {
        Author.find({}, function(err, authors){
            if (err){
                res.json(err)
            }
            res.json({message: "success", data:authors})
        })
    	
    },
    show: function(req, res) {
        Author.findOne ({_id: req.params.id}, function (err,data){
            if (err){
                res.json(err);
            }
            else {
                res.json({data})
            }

        })
    },
    post: function (req, res){
        console.log("POST DATA", req.body);
 
        const newauthor = new Author (req.body);
        
        newauthor.save(function(err,Author) {
  
            if(err) {
                console.log('something went wrong');
                res.json({message: "error", data:err})
            } 
            else {
                console.log('successfully added a task!');
                console.log(Author);
                res.json({message: "success", data:Author});
            }
    });
},
delete: function(req, res) {
    Author.deleteOne ({id: req.params._id}, function (err){
        if (err){
            res.json(err)
        }
        else {
            res.json ({message: "success"})
        }
    })
},
   

    put: function(req, res) {
        console.log("doing edit")
        Author.findOne ({id: req.params._id}, function (err,authors){
 
            authors.name = req.body.name;

            authors.save(function(err){
                if (err){
                    res.json(err)
                }
                else{
                    res.json ({message: "success", data:authors})
                    
                }
            })
        })
        
        
    	
    }
};