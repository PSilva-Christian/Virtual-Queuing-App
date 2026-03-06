import { Component } from '@angular/core';
import { GetNextSenha } from '../../../core/services/senha-services/get-next-senha';
import { SenhaInterface } from '../../../data/models/senha-interface';
import { Senha } from '../../../core/services/senha-services/add-senha';

@Component({
  selector: 'app-user',
  imports: [],
  templateUrl: './user.html',
  styleUrl: './user.css',
})
export class User {

  currentlySenha?: SenhaInterface;
  constructor(private nextSenha: GetNextSenha) {}

  callOutros(){}

  callNext(){
    this.nextSenha.callNextSenha().subscribe({
      next: (data) => this.currentlySenha = data,
      error: (err) => console.log("Error in calling senha", err)

    });
  }
}
