import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-seatlle',
  templateUrl: './seatlle.component.html',
  styleUrls: ['./seatlle.component.css']
})
export class SeatlleComponent implements OnInit {

  constructor(private _http: HttpService) { }

  ngOnInit() {
    this.seattle()
  }

  seattle() {
    let weather = this._http.get('api.openweathermap.org/data/2.5/weather?q=Seattle,us&APPID=1c88805e61e364af89ba1f17172b6663');
    weather.subscribe(data => console.log(data))
  }


}
