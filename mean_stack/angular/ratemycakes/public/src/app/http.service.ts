import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
   constructor(private _http: HttpClient) {

      
  }

  addcake(newcake){
    return this._http.post('/cakes', newcake)

  } 
  addreview(rating,comment, id){
    return this._http.post('/review', {rating: rating, comment:comment,id:id})
 
  } 
  showcake(id){
    return this._http.get('/showcake/'+id)

  } 

  getcakes(){
    return this._http.get('/cakes')

  } 



  


}
 
