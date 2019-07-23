import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpService } from './http.service';
import { Routes, RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { SeatlleComponent } from './seatlle/seatlle.component';
import { BurbankComponent } from './burbank/burbank.component';
import { SanjoseComponent } from './sanjose/sanjose.component';
import { DCComponent } from './dc/dc.component';
import { ChicagoComponent } from './chicago/chicago.component';


@NgModule({
  declarations: [
    AppComponent,
    SeatlleComponent,
    BurbankComponent,
    SanjoseComponent,
    DCComponent,
    ChicagoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule
    
  ],
  exports: [RouterModule],
  providers: [HttpService, SanjoseComponent],
  bootstrap: [AppComponent]
})
export class AppModule { } 


