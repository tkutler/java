var mongoose = require('mongoose');

// var UserSchema = new mongoose.Schema({
//     name: String,
//     quote: String,
//     created_at: Date,
//    })
// mongoose.model('User', UserSchema);
var Products = mongoose.model('Products'); 
module.exports = {
    index: function(req, res) {
        Products.find({}, function(err, data){
            if (err){
                console.log("error")
            }
            res.json({message: "success", data:data})
        })
    	
    },
    show: function(req, res) {
        Products.findOne ({_id: req.params.id}, function (err,data){
            if (err){
                console.log(err);
            }
            else {
                res.json({message: "success", data:data})
            }

        })
    },
    post: function (req, res){
        console.log("POST DATA", req.body);
 
        const newproduct = new Products(req.body);
        
        newproduct.save(function(err,data) {
  
            if(err) {
                console.log(err);
                
            } 
            else {
                console.log('successfully added a product!');
                console.log(data);
                res.json({message: "success", data:data});
            }
    });
},
delete: function(req, res) {
    Products.deleteOne ({id: req.params._id}, function (err){
        if (err){
            res.json(err)
        }
        else {
            res.json ({message: "success"})
        }
    })
},
   

    put: function(req, res) {
        console.log("in controller", req.body);

        Products.findOneAndUpdate ({_id: req.params.id}, req.body, function (err,product){
            if (err){
                res.json(err)
            }
            else{
                res.json({message: "success update", data:product})
            }
        })
    }
};