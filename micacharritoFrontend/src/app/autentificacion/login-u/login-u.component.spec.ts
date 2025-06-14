import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginUComponent } from './login-u.component';

describe('LoginUComponent', () => {
  let component: LoginUComponent;
  let fixture: ComponentFixture<LoginUComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LoginUComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LoginUComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
