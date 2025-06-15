import { Routes } from '@angular/router';
import { HomeAdminComponent } from './admin/home-admin/home-admin.component';
import { LoginAdminComponent } from './autentificacion/login-admin/login-admin.component';

export const routes: Routes = [
    { path: '', redirectTo: 'login-admin', pathMatch: 'full' },
  { path: 'login-admin', component: LoginAdminComponent },
  { path: 'home-admin', component: HomeAdminComponent },

];
