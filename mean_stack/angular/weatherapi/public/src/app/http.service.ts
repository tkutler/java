import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
   constructor(private _http: HttpClient) {
      this.getPokemon();
      this.getabilities();
      this.compareabilities();
      this.getweather('San Jose');
  }
  getPokemon(){
    console.log('i')
    let bulbasaur = this._http.get('https://pokeapi.co/api/v2/pokemon/1/');
    bulbasaur.subscribe(data => console.log(data))
    
} 
  getweather(city){
    return this._http.get('https://api.openweathermap.org/data/2.5/weather?q=' + city +'&APPID=1c88805e61e364af89ba1f17172b6663');
  }


  getabilities(){
      console.log('i')
      let bulbasaur = this._http.get('https://pokeapi.co/api/v2/pokemon/1/');
      bulbasaur.subscribe(data => console.log("bulbasaurs abilities are:", data["abilities"][0]['ability']['name'],'and', data["abilities"][1]['ability']['name']) )
      
  }

compareabilities(){
  console.log('i')
  let bulbasaur = this._http.get('https://pokeapi.co/api/v2/ability/34/');
  bulbasaur.subscribe(data => console.log(data['pokemon'].length + 1) )
  
}
}
 
