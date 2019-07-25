import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-all',
  templateUrl: './all.component.html',
  styleUrls: ['./all.component.css']
})
export class AllComponent implements OnInit {
  allProducts: any;
  oneProduct: any;

  constructor(private _httpService: HttpService,
    private _route: ActivatedRoute,
    private _router: Router) { }

  ngOnInit() {
    this.findProducts()
  }
  findProducts(){
    let tempObservable = this._httpService.getProducts();
    tempObservable.subscribe(data =>{
      this.allProducts = data['data'];
      console.log(this.allProducts)
    })

  }
  retrieve(id){
    let observable = this._httpService.getOneProduct(id);
    observable.subscribe(data => {
      this.oneProduct = data,
      console.log(data)
      
    

    })
  }
  ondelete(id){
    let tempObservable = this._httpService.delete(id);
    console.log(id)
    tempObservable.subscribe(data =>{
      console.log("deleted");
      this.findProducts();

    })
  }

}
