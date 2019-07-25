import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
   constructor(private _http: HttpClient) {
      
  }
  getauthor(id){
    return this._http.get('/authors/'+id)

  }
  delete(id){
    return this._http.delete('/authors/delete/'+id);
  }
  getauthors(){
    console.log("in getauthor service")
    return this._http.get('/authors')

  } 
  edit(id, edit){
    console.log("in edit service")
    console.log(edit)
    console.log(id)
    return this._http.put('/authors/update/'+id, edit.data);

  }
  addauthor(newAuthor){
    console.log("in add service")
    console.log(newAuthor)
    return this._http.post('/newauthors', newAuthor)
  }

 
}

 
