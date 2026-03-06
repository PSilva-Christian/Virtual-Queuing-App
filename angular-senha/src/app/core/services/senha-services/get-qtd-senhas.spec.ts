import { TestBed } from '@angular/core/testing';

import { NumberSenha } from './get-qtd-senhas';

describe('NumberSenha', () => {
  let service: NumberSenha;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NumberSenha);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
