import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpService } from './http.service';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { EditComponent } from './edit/edit.component';
import { NewComponent } from './new/new.component';
import { AllComponent } from './all/all.component';


@NgModule({
  declarations: [
    AppComponent,
    EditComponent,
    NewComponent,
    AllComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    
    
  ],
  providers: [HttpService],
  bootstrap: [AppComponent]
})
export class AppModule { } 


