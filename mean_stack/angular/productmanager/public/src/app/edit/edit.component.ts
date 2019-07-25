import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  id: any;
  edit: any;

  constructor(private _httpService: HttpService,     private _route: ActivatedRoute,
    private _router: Router){}

  ngOnInit() {
    this.edit = {title: "", price: "", url: ""}
    this._route.params.subscribe((params: Params) => {
      console.log("PRINTING PARAMS", params['id'])
      this.id = params['id'] 
      this.getProduct(this.id)
    })
  }

  getProduct(id){
    let observable = this._httpService.getOneProduct(id);
    observable.subscribe(data =>{
      console.log("in getproduct",data)
      this.edit=data['data'];
    })
  }
  onSubmit(){ 
    
    console.log("&&&&&&&&", this.id)
    let tempObservable = this._httpService.edit(this.id, {data: this.edit});
    tempObservable.subscribe(data => {
      console.log("*******" , data)
      this._router.navigate(['/all']);
      
      
      

    })
  }
}
