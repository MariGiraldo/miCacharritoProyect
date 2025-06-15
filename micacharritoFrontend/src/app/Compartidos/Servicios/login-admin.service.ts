import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginAdminService {

private baseUrl = 'http://localhost:8080/ver/c1';

  constructor(private http: HttpClient) {}

  loginAdministrador(email: string, password: string): Observable<boolean> {
  return this.http.post<boolean>(`${this.baseUrl}/login`, { email, password });
}
} 