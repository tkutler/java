import { Component } from '@angular/core';
import { HttpService } from './http.service';
import { ThrowStmt } from '@angular/compiler';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  newcake: any ;
  allcakes: any;
  show: any;
  newreview: any= {};
  constructor(private _httpService: HttpService){this.newcake = {name:'',url: ''}}

  ngOnInit(){
    this.getallcakes()


  } 



addcake() {
  // Code to send off the form data (this.newTask) to the Service
  // ...
  // Reset this.newTask to a new, clean object.
  let tempObservable =this._httpService.addcake(this.newcake);
  tempObservable.subscribe(data => {
    console.log('this is the cake we added ', data);
    this.getallcakes();

  })
  
  }  
  showcake(id){
    console.log("in component show function", id)
    let tempObservable = this._httpService.showcake(id);
    tempObservable.subscribe(data =>{
      console.log(data);
      this.show= data['data'];
      console.log(this.show)
    }

    )
  }

  addreview(id, rating, comment) {
    console.log(id,rating,comment)
    this.newreview.id = id; 
    this.newreview.rating = rating.value;
    this.newreview.comment = comment.value; 
    console.log(this.newreview)
    // Code to send off the form data (this.newTask) to the Service
    // ...
    // Reset this.newTask to a new, clean object.
    let tempObservable =this._httpService.addreview(rating.value,comment.value,id);
    tempObservable.subscribe(data => {

      console.log('this is the review we added ', data);
      this.getallcakes();
  
    })
    
    } 
  getallcakes(){
    let tempObservable3 = this._httpService.getcakes();
    tempObservable3.subscribe(data =>{
      console.log('got all cakes', data);
      this.allcakes = data['cakes'];
      console.log(this.allcakes);
      

    });
  }

}


