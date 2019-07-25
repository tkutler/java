import { Component, OnInit, Input } from '@angular/core';
import { HttpService } from '../http.service';
import { AppComponent } from '../app.component';
import { AllComponent } from '../all/all.component';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit { 
oneauthor: any; 
edit: any;
id: any;
@Input() 
child: any;


constructor(private _httpService: HttpService,     private _route: ActivatedRoute,
  private _router: Router){}

  ngOnInit() {
    console.log("we are in edit component", this.child)
    this.edit = {name: ""}
    this._route.params.subscribe((params: Params) => {
      console.log("PRINTING PARAMS", params['id'])
      this.id = params['id'] 
  } )
}
  onSubmit(id){ 
    
    console.log("&&&&&&&&", this.id)
    let tempObservable = this._httpService.edit(this.id, {data: this.edit});
    tempObservable.subscribe(data => {
      console.log("*******" , data)
      this._router.navigate(['/all']);
      
      
      

    })
  }

}
