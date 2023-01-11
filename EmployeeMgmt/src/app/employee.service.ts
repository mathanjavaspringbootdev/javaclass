import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = 'http://localhost:8080/';

  constructor(private http: HttpClient) { }

  getEmployeeList(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + 'employees/');
  }

  createEmployee(employee: object): Observable<object> {
    return this.http.post(`${this.baseUrl}` + 'employees/', employee);
  }

  deleteEmployee(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}employees/${id}`, { responseType: 'text' });
  }

  getEmployee(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}employees/${id}`);
  }

  updateEmployee(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}employees/${id}`, value);
  }

}
