import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class Senha {
  private baseUrl = 'http://localhost:8080/senhas';

  constructor(private http: HttpClient) { }

  addSenha(senhaType: any): Observable<any[]> {
    const newSenha = {
      type: senhaType
    }
    return this.http.post<any[]>(this.baseUrl, newSenha);
  }
}

