import { Component, OnInit } from '@angular/core';
import { HttpService } from './http.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'app';
  task: any; 
  alltask: any;
  newTask: any;
  id: any; 
  recenttask: any;
  constructor(private _httpService: HttpService){}
  

  ngOnInit(){
    this.newTask = { title: "", description: "" }

  }
  addTask() {
    // Code to send off the form data (this.newTask) to the Service
    // ...
    // Reset this.newTask to a new, clean object.
    let tempObservable =this._httpService.addTask(this.newTask);
    tempObservable.subscribe(data => {
      console.log('this is the task we added ', data)
      const taskid= data;
      this.getalltasks();

    })
    
  } 
  edit(id){
    console.log("in component edit function", id)
    let tempObservable = this._httpService.put(id, {data: this.recenttask});
    tempObservable.subscribe(data =>{
      console.log("updated", data);
      this.getalltasks();
    })
  } 
  show(id){
    console.log("in component show function", id)
    let tempObservable = this._httpService.show(id);
    tempObservable.subscribe(data =>{
      console.log(data)
    }

    )
  }


  getTaskFromService(id){
    let tempObservable = this._httpService.getonetask(id);
    tempObservable.subscribe(data => {
      console.log('got the task', data);
      this.task = data['data'];
      console.log(this.task);
   });
  }
  delete(id){
    console.log("in component delete function", id)
    let tempObservable = this._httpService.delete(id);
    tempObservable.subscribe(data =>{
      console.log("deleted");
      this.getalltasks();
    })
  }
  getalltasks(){
    let tempObservable3 = this._httpService.getTasks();
    tempObservable3.subscribe(data =>{
      console.log('got all tasks', data);
      this.alltask = data['data'];
      console.log(this.alltask)

    });
  }
}



