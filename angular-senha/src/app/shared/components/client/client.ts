import { Component, OnInit } from '@angular/core';
import { Senha } from '../../../core/services/senha-services/add-senha';
import { NumberSenha } from '../../../core/services/senha-services/get-qtd-senhas';

@Component({
  selector: 'app-client',
  imports: [],
  templateUrl: './client.html',
  styleUrl: './client.css',
})


export class Client{

  senha: any;
  mycounter: any;
  
  constructor(private senhaService : Senha, private numberSenha: NumberSenha){
    this.numberSenha = numberSenha;
    this.mycounter = numberSenha.getNumberSenha();
  }

  addCounter(senhaType: any): void{

    this.senhaService.addSenha(senhaType).subscribe({
      next: (data) => this.senha = data,
      error: (err) => console.log("Connection failed...", err),
    })
    
    this.mycounter = this.numberSenha.getNumberSenha();

  }

}
