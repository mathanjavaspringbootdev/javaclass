import { Component, NgIterable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {

  constructor(private employeeservice: EmployeeService) { }

  employeesArray: any[] = [];
  dtOptions: DataTables.Settings = {};
  dtTrigger: Subject<any> = new Subject();

  employees: Observable<Employee[]> | undefined;
  employee: Employee = new Employee();
  deleteMessage = false;
  employeelist: any;
  isupdated = false;


  ngOnInit() {
    this.isupdated = false;
    this.dtOptions = {
      pageLength: 6,
      stateSave: true,
      lengthMenu: [[6, 16, 20, -1], [6, 16, 20, "All"]],
      processing: true
    };
    this.employeeservice.getEmployeeList().subscribe(data => {
      this.employees = data;
      this.dtTrigger.next(1);
    })
  }

  deleteEmployee(id: number) {
    this.employeeservice.deleteEmployee(id)
      .subscribe(
        data => {
          console.log(data);
          this.deleteMessage = true;
          this.employeeservice.getEmployeeList().subscribe(data => {
            this.employees = data
          })
        },
        error => console.log(error));
  }

  updateEmployee(id: number) {
    this.employeeservice.getEmployee(id)
      .subscribe(
        data => {
          this.employeelist = data
        },
        error => console.log(error));
  }

  employeeupdateform = new FormGroup({
    employee_id: new FormControl(),
    employee_name: new FormControl(),
    employee_email: new FormControl(),
    employee_branch: new FormControl()
  });
  /*
  updateEmp(updemp: any) {
    this.employee = new Employee();
    this.employee.id = this.employeeupdateform.get('id').value;
    this.employee.firstName = this.employeeupdateform.get('first_name').value;
    this.employee.lastName = this.employeeupdateform.get('last_nmae').value;
    this.employee.email = this.employeeupdateform.get('email').value;

    this.employeeservice.updateEmployee(this.employee.id, this.employee).subscribe(
      data => {
        this.isupdated = true;
        this.employeeservice.getEmployeeList().subscribe(data => {
          this.employees = data
        })
      },
      error => console.log(error));
  }
  get EmployeeId() {
    return this.employeeupdateform.get('id');
  }
  */
  changeisUpdate() {
    this.isupdated = false;
  }

}
