import { Component, OnInit, Input } from '@angular/core';
import { HttpService } from '../http.service'; 

@Component({
  selector: 'app-sanjose',
  templateUrl: './sanjose.component.html',
  styleUrls: ['./sanjose.component.css']
})
export class SanjoseComponent implements OnInit {
  @Input() childweather: any 

  constructor(private _http: HttpService) {
    
   }

  ngOnInit() {
    console.log("we are in san jose" , this.childweather)
  }
  sanjose() {
 
  }

}
