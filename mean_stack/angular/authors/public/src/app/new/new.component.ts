import { Component, OnInit, Input } from '@angular/core';
import { HttpService } from '../http.service';
import { AppComponent } from '../app.component';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {
  newAuthor: any; 
  @Input()
  child: any;


  constructor(private _httpService: HttpService,private _route: ActivatedRoute,
    private _router: Router) {}

  ngOnInit() {
    this.newAuthor = {name: ""}
  } 
  addnew() {
    console.log(this.newAuthor)
    let tempObservable = this._httpService.addauthor(this.newAuthor);
    tempObservable.subscribe (data => {
      console.log('we added this author:', data)
      console.log("adding new author")
      this._router.navigate(['/all']);
    
    })
  }

}
