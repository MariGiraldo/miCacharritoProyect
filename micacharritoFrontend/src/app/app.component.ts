import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LoginAdminComponent } from './autentificacion/login-admin/login-admin.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [LoginAdminComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'micacharrito';
}
