import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class NumberSenha {
  private baseUrl = 'http://localhost:8080/senhas/increment';
  private qtdSenha: any;

  constructor(private http: HttpClient){}


  getNumberSenha(): any{
    this.http.get<any>(this.baseUrl).subscribe({
      next: (data)=> this.qtdSenha = data,
      error: (err) => console.log("Error", err)
    });
    return this.qtdSenha;
  }

}
