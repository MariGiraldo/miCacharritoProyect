import { TestBed } from '@angular/core/testing';

import { LoginUService } from './login-u.service';

describe('LoginUService', () => {
  let service: LoginUService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoginUService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
