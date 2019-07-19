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
   getonetask(id){
    return this._http.get('/tasks/'+id);
   }
   // postTasks(){
   //  let tempObservable2 = this._http.post('/tasks');
   //  tempObservable2.subscribe(data => console.log("posted task!", data));
   // }
   getTasks(){
      return this._http.get('/tasks');

   }
   delete(id){
      console.log("in service delete", id)
      return this._http.delete('/tasks/'+id);
      
   }
   show(id){
      console.log("in service show", id)
      return this._http.get('/tasks/'+id);
      
   }
   put(id,recenttask){
      console.log("in service edit", id)
      console.log(recenttask)
      return this._http.put('/tasks/'+id,recenttask.data);
      
   }
   addTask(newtask){
      return this._http.post('/tasks', newtask)
  }
}


 