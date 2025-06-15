import { NavegacionComponent } from './Compartidos/navegacion/navegacion.component';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'micacharrito';
  constructor(private router: Router) {}

  esLoginAdmin(): boolean {
    return this.router.url.includes('login-admin');
  }
}
