import { TestBed } from '@angular/core/testing';

import { GestionAlquilerService } from './gestion-alquiler.service';

describe('GestionAlquilerService', () => {
  let service: GestionAlquilerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GestionAlquilerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
