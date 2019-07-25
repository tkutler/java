import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
   constructor(private _http: HttpClient) {}


  addProduct(newProduct){
    console.log("in add service")
    console.log(newProduct)
    return this._http.post('/products', newProduct)
  }
  getProducts(){
    console.log("in getproduct service")
    return this._http.get('/products')

  } 
  delete(id){
    return this._http.delete('/products/delete/'+id);
  }
  getOneProduct(id){
    return this._http.get('/products/'+id)

  }
  edit(id, edit){
    console.log("in edit service id", id)
    console.log(edit)
    return this._http.put('/products/update/'+id, edit.data);

  }

  
 
}

 
