import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestionAlquilerComponent } from './gestion-alquiler.component';

describe('GestionAlquilerComponent', () => {
  let component: GestionAlquilerComponent;
  let fixture: ComponentFixture<GestionAlquilerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GestionAlquilerComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GestionAlquilerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
