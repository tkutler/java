import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service'; 

@Component({
  selector: 'app-burbank',
  templateUrl: './burbank.component.html',
  styleUrls: ['./burbank.component.css']
})
export class BurbankComponent implements OnInit {

  constructor(private _http: HttpService) { }

  ngOnInit() {
    this.burbank()
  }
  burbank() {
    let weather = this._http.get('api.openweathermap.org/data/2.5/weather?q=Burbank,us&APPID=1c88805e61e364af89ba1f17172b6663');
    weather.subscribe(data => console.log(data))
  }


}
