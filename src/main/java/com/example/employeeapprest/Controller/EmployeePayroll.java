package com.example.employeeapprest.Controller;//package com.example.employeerest.Controller;


import com.example.employeeapprest.Module.EmployeeDetails;
import com.example.employeeapprest.Service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeePayroll {

    @Autowired
    EmployeePayrollService employeePayrollService;



    @PostMapping("/save")
    public EmployeeDetails save(@RequestBody EmployeeDetails employeeDetails){
        EmployeeDetails employeeDetails1=employeePayrollService.save(employeeDetails);
        return employeeDetails1;
    }

    @GetMapping("/empdata")
    public List<EmployeeDetails> displayAll(){
        return employeePayrollService.display();
    }
    @GetMapping("/find/{id}")
    public Optional<EmployeeDetails> findById(@PathVariable int id ){
        return employeePayrollService.getById(id);
    }



    @DeleteMapping("/remove/{id}")
    public String delete(@PathVariable int id){
        return employeePayrollService.deleteById(id);
    }
}
