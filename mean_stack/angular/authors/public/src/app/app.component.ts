import { Component, OnInit } from '@angular/core';
import { HttpService } from './http.service';
import { EditComponent } from './edit/edit.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  title = 'app';
  allauthors:any;
  oneauthor: any;

  constructor(private _httpService: HttpService){}
  
  
  ngOnInit() {
    
    
  }
    
} 

  


