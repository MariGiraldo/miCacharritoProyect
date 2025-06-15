
import { LoginAdmin } from '../../Compartidos/entities/login-admin';
import { LoginAdminService } from '../../Compartidos/Servicios/login-admin.service';
import { FormsModule } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NavegacionComponent } from '../../Compartidos/navegacion/navegacion.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-login-admin',
  standalone: true,
  imports: [FormsModule, NavegacionComponent,HttpClientModule],
  templateUrl: './login-admin.component.html',
  styleUrl: './login-admin.component.css'
})
export class LoginAdminComponent implements OnInit{
  email: string = '';
  password: string = '';

  constructor(private authService: LoginAdminService, private router: Router) {}

    ngOnInit(): void {
      
    }


  loginAdmin() {
  this.authService.loginAdministrador(this.email, this.password).subscribe({
    next: (res: boolean) => {
      if (res) {
        this.router.navigate(['/home-admin']);
      } else {
        alert('Credenciales inválidas');
      }
    },
    error: err => {
      alert('Error en el servidor');
      console.error(err);
    }
  });
}
}  