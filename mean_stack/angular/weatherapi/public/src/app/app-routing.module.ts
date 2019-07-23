import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SanjoseComponent } from './sanjose/sanjose.component';
import { SeatlleComponent } from './seatlle/seatlle.component';
import { DCComponent } from './dc/dc.component';
import { ChicagoComponent } from './chicago/chicago.component';
import { BurbankComponent } from './burbank/burbank.component';

const routes: Routes = [{ path: 'sanjose',component: SanjoseComponent },
{ path: 'seattle',component: SanjoseComponent },
{ path: 'dc',component: SanjoseComponent },
{ path: 'burbank',component: SanjoseComponent },
{ path: 'chicago',component: SanjoseComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
