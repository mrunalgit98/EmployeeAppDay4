package com.example.employeeapprest.Repository;


import com.example.employeeapprest.Module.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails,Integer> {
}
