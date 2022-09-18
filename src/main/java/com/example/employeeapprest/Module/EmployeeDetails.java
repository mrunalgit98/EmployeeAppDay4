package com.example.employeeapprest.Module;//package com.example.employeerest.Module;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

    String firstName;
    String lastName;
    String gender;
    String department;
    long empSalary;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    @Id
    private Integer id;

    public EmployeeDetails(EmployeeDetails employeeDetails) {
        this.firstName = employeeDetails.firstName;
        this.lastName = employeeDetails.lastName;
        this.department = employeeDetails.department;
        this.gender = employeeDetails.gender;
        this.id = employeeDetails.id;
        this.empSalary = employeeDetails.empSalary;
    }

    public EmployeeDetails(String message) {
        this.message = message;

    }

    public EmployeeDetails() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }


}