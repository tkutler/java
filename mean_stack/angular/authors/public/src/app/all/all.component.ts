import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-all',
  templateUrl: './all.component.html',
  styleUrls: ['./all.component.css']
})
export class AllComponent implements OnInit { 
  oneauthor: any;
  allauthors:any;

  constructor(private _httpService: HttpService,
    private _route: ActivatedRoute,
    private _router: Router) { }

  ngOnInit() {
    this.findauthors()
  }
  findauthors(){
    let tempObservable = this._httpService.getauthors();
    tempObservable.subscribe(data =>{
      this.allauthors = data['data'];
      console.log(this.allauthors)
    })

  }
  ondelete(id){
    let tempObservable = this._httpService.delete(id);
    console.log(id)
    tempObservable.subscribe(data =>{
      console.log("deleted");
      this.findauthors();

    })
  }
  retrieve(id){
    let observable = this._httpService.getauthor(id);
    observable.subscribe(data => {
      this.oneauthor = data,
      console.log(data)
      
    

    })
  }
}
