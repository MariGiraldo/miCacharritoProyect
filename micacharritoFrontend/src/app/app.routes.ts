import { Routes } from '@angular/router';
import { HomeAdminComponent } from './admin/home-admin/home-admin.component';
import { LoginAdminComponent } from './autentificacion/login-admin/login-admin.component';

export const routes: Routes = [
    { path: 'home-admin', component: HomeAdminComponent },
    { path: 'login', component: LoginAdminComponent }

];
