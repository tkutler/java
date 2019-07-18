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
  constructor(private _httpService: HttpService){}
  

  ngOnInit(){

  }
  getTaskFromService(){
    let tempObservable = this._httpService.getonetask();
    tempObservable.subscribe(data => {
      console.log('got the task', data);
      this.task = data['data'];
      console.log(this.task);
   });
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



