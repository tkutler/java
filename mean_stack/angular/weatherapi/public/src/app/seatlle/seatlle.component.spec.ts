import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SeatlleComponent } from './seatlle.component';

describe('SeatlleComponent', () => {
  let component: SeatlleComponent;
  let fixture: ComponentFixture<SeatlleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeatlleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeatlleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
