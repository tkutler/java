import { Component } from '@angular/core';
import { HttpService } from './http.service';
import { SanjoseComponent } from './sanjose/sanjose.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  weather: any 
  constructor(private _httpService: HttpService, private _sanjose: SanjoseComponent){}

  retrieve(city): any {
    console.log("we are in  root" , this.weather)
    let observable = this._httpService.getweather(city);
    observable.subscribe(data => {
      this.weather = data,
      console.log("******" , data),
      this._sanjose.childweather = this.weather
    } 
    )
    }
}


