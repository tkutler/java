const mongoose = require('mongoose');
var controllers = require('../controllers/controllers.js');

module.exports = function(app){
  app.get('/cakes', function(req, res) {
    controllers.index(req,res);

  })
  app.post('/review', function(req, res) {
    console.log("req.body",req.body);
    controllers.review(req, res);
  
    })
    app.get('/showcake/:id', function(req, res) {
      controllers.showcake(req,res);
  
    })
    
  app.get('/tasks/:id', function(req, res) {
    controllers.show(req,res);

  })
  app.post('/cakes', function(req, res) {
    console.log("req.body",req.body);
    controllers.post(req, res);
  
    })
  app.delete('/tasks/delete/:id', function(req, res) {
    controllers.delete(req, res);
      
        })
  app.put('/task/update/:id', function(req, res) {
    controllers.put(req, res);

  })
}
