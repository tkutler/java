import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {
  newProduct: any;

  constructor(private _httpService: HttpService,private _route: ActivatedRoute,
    private _router: Router) {}

  ngOnInit() { 
    this.newProduct = {title: "", price: "", url: ""}
  }
  addNew() {
    console.log(this.newProduct)
    let tempObservable = this._httpService.addProduct(this.newProduct);
    tempObservable.subscribe (data => {
      console.log('we added this Product:', data)
      console.log("adding new product")
      this._router.navigate(['/all']);
    
    })
  }

}
