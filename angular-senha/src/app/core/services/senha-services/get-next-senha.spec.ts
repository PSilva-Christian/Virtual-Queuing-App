import { TestBed } from '@angular/core/testing';

import { GetNextSenha } from './get-next-senha';

describe('GetNextSenha', () => {
  let service: GetNextSenha;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetNextSenha);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
