const mongoose = require('mongoose');
var controllers = require('../controllers/controllers.js');

module.exports = function(app){
  app.get('/tasks', function(req, res) {
    controllers.index(req,res);

  })
    
  app.get('/tasks/:id', function(req, res) {
    controllers.show(req,res);

  })
  app.post('/tasks', function(req, res) {
    console.log("req.body",req.body);
    controllers.post(req, res);
  
    })
  app.delete('/tasks/:id', function(req, res) {
    console.log("in routes")
    controllers.delete(req, res);
      
  })
  app.put('/tasks/:id', function(req, res) {
    controllers.put(req, res);

  })
}
