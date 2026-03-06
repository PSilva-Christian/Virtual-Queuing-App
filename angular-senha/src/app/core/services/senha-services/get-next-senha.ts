import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SenhaInterface } from '../../../data/models/senha-interface';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class GetNextSenha {
  baseURL = "http://localhost:8080/senhas";

  constructor( private http : HttpClient) {}

  callNextSenha(): Observable<SenhaInterface> {
    return this.http.delete<SenhaInterface>(this.baseURL);
  }

}
