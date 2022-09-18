package com.example.employeeapprest.Service;



import com.example.employeeapprest.Module.EmployeeDetails;
import com.example.employeeapprest.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService {

    @Autowired
EmployeeRepo employeeRepo;
    public EmployeeDetails save(EmployeeDetails employeeDetails) {
        EmployeeDetails employeeDetails1 = new EmployeeDetails(employeeDetails);
        employeeRepo.save(employeeDetails1);
        return employeeDetails1;
    }

    public List<EmployeeDetails> display() {
        return employeeRepo.findAll();
    }
    public Optional<EmployeeDetails> getById(int id) {
        return employeeRepo.findById(id);

    }
    public String deleteById(int id) {
        employeeRepo.deleteById(id);
        return "User by id "+id+" is Deleted";
    }
}