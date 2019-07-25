const mongoose = require('mongoose');
var controllers = require('../controllers/controllers.js');
var path = require('path');

module.exports = function(app){
  app.get('/products', function(req, res) {
    controllers.index(req,res);

  })
    
  app.get('/products/:id', function(req, res) {
    controllers.show(req,res);

  })
  app.post('/products', function(req, res) {
    console.log("req.body",req.body);
    controllers.post(req, res);
  
    })
  app.delete('/products/delete/:id', function(req, res) {
    controllers.delete(req, res);
      
        })
  app.put('/products/update/:id', function(req, res) {
    controllers.put(req, res);

  })
  app.all("*", (req,res,next) => {
    res.sendFile(path.resolve("./public/dist/public/index.html"))
  });
}
