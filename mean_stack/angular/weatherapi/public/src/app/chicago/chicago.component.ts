import { Component, OnInit, Input } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-chicago',
  templateUrl: './chicago.component.html',
  styleUrls: ['./chicago.component.css']
})
export class ChicagoComponent implements OnInit {
  @Input() childweather: any 
  constructor(private _http: HttpService) { }

  ngOnInit() {
    this.chicago()
  }
  chicago() {
    this._http.getweather('Chicago')
  }


}
