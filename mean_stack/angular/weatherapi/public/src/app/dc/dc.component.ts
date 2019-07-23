import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
@Component({
  selector: 'app-dc',
  templateUrl: './dc.component.html',
  styleUrls: ['./dc.component.css']
})
export class DCComponent implements OnInit {

  constructor(private _http: HttpService) { }

  ngOnInit() {
    this.dc()
  }
  dc() {
    let weather = this._http.get('api.openweathermap.org/data/2.5/weather?id=4140963&APPID=1c88805e61e364af89ba1f17172b6663');
    weather.subscribe(data => console.log(data))
  }


}
