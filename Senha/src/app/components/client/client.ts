import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-client',
  imports: [],
  templateUrl: './client.html',
  styleUrl: './client.css',
})
export class Client {
  mycounter: number = 1;

  addCounter(){
    this.mycounter++;
  }
}
