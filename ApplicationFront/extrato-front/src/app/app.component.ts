import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Extrato de Lançamentos';
  extrato: any;
  config: any;

  constructor(private http: HttpClient) {}

  pageChanged(event){
    this.config.currentPage = event;
  }

  ngOnInit(): void {
    this.consultarExtrato();
  }

  consultarExtrato() {
   return this.http.get<any>('http://localhost:8080/extrato')
      .subscribe(data => {
        this.extrato = data;
        this.config = {
          itemsPerPage: this.extrato.tamanhoPagina,
          currentPage: 1,
          totalItems: this.extrato.totalElements
        };
      });
  }

}
