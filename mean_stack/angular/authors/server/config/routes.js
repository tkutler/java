const mongoose = require('mongoose');
var controllers = require('../controllers/controllers.js');
var path = require('path');

module.exports = function(app){

  app.get('/authors', function(req, res) {
    
    controllers.index(req,res);

  })
  app.get('/authors/:id', function(req,res){
    controllers.show(req, res);
  })
  

  app.post('/newauthors', function(req, res) {
    console.log("req.body",req.body);
    controllers.post(req, res);
  
    })
  app.delete('/authors/delete/:id', function(req, res) {
    controllers.delete(req, res);
      
        })
      
  app.put('/authors/update/:id', function(req, res) {
    controllers.put(req, res);

  })
  app.all("*", (req,res,next) => {
    console.log("in catch all")
    res.sendFile(path.resolve("./public/dist/public/index.html"))
  });
}
