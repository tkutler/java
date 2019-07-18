import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  
  constructor(private _http: HttpClient){
   //   this.getTasks();
   //   this.getonetask();
   //   this.postTasks();
   }
   getonetask(){
    return this._http.get('/tasks/5d2fbdcb990784658aab3141');
   }
   // postTasks(){
   //  let tempObservable2 = this._http.post('/tasks');
   //  tempObservable2.subscribe(data => console.log("posted task!", data));
   // }
   getTasks(){
      return this._http.get('/tasks');

   }
}


 