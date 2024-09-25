import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Component({
  selector: 'app-labseq',
  templateUrl: './labseq.component.html',
  styleUrls: ['./labseq.component.css']
})
export class LabseqComponent {
  index: number = 0;
  labseqValue: number | null = null;

  constructor(private http: HttpClient) {}

  getLabseqValue() {
    this.http.get<number>(`${environment.apiUrl}/labseq/${this.index}`)
      .subscribe(value => this.labseqValue = value);
  }
}