var mongoose = require('mongoose');

const Cakes = mongoose.model('Cakes');
const Review = mongoose.model('Review');
 
module.exports = {
    index: function(req, res) {
        Cakes.find({}, function(err, cakes){
            if (err){
                console.log("error")
            }
            res.json({message: "success", cakes: cakes})
        })
    	
    },
    show: function(req, res) {
        Tasks.findOne ({_id: req.params.id}, function (err,task){
            if (err){
                console.log(err);
            }
            else {
                res.json({message: "success", data:task})
            }

        })
    },
    showcake: function(req, res) {
        Cakes.findOne ({_id: req.params.id}, function (err,data){
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
 
        var newcake = new Cakes (req.body);
        
        newcake.save(function(err,data) {
  
            if(err) {
                console.log('something went wrong');
            } 
            else {
                console.log('successfully added a cake!');
                console.log(Cakes);
                res.json({message: "success", data:Cakes});
            }
    });
},
review: function (req, res){
    console.log("POST DATA", req.body);

    var newreview = new Review (req.body);
    
    // newreview.save(function(err,data) {

    //     if(err) {
    //         console.log('something went wrong');
    //     } 
    //     else {
    //         console.log('successfully added a review!');
    //         console.log(data);
    //         res.json({message: "success", review:data});
    //     }
    
        console.log(newreview)
        console.log("adding to cakeschema")
        console.log('this is the' , req.body)
        Cakes.updateOne({_id:req.body.id}, {$push:{reviews:newreview}}, function(err,cake){
            console.log('finished update')
            if (err){
                console.log(err)
                res.json(err)
            }
            else{
            console.log("added to cakeschema")
            res.json({message: "success pushed into cakes", data:cake})
            }
        })
    

},
delete: function(req, res) {
    Tasks.remove ({title: req.params.title}, function (err){
        if (err){
            console.log(err)
        }
        else {
            res.redirect('/')
        }
    })
}, 

   

    put: function(req, res) {
        Tasks.findOne ({title: req.params.title}, function (err,tasks){
            tasks.title = req.body.title;
            tasks.description = req.body.description;
            tasks.save(function(err){
                if (err){
                    console.log(err)
                }
                else{
                    res.redirect("/")
                }
            })
        })
        
        
    	
    }
};