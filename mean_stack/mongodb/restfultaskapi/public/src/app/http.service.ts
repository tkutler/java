import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  constructor(private _http: HttpClient){
     this.getTasks();
     this.getonetask();
     this.postTasks();
   }
   getonetask(){
    let tempObservable = this._http.get('/tasks/5d2d2f039079d71ce52b1174');
    tempObservable.subscribe(data => console.log('got the task', data));
   }
   postTasks(){
    let tempObservable = this._http.post('/tasks');
    tempObservable.subscribe(data => console.log("posted task!", data));
   }
   getTasks(){
   // our http response is an Observable, store it in a variable
      let tempObservable = this._http.get('/tasks');
   // subscribe to the Observable and provide the code we would like to do with our data from the response
      tempObservable.subscribe(data => console.log("Got our tasks!", data));
   }
}


 