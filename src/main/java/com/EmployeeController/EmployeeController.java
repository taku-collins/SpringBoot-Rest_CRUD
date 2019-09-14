/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EmployeeController;

import com.Employee.Employee;
import com.EmployeeDeo.EmployeeDeo;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author collins
 */

@RestController
@RequestMapping("/company")
public class EmployeeController {
    
    @Autowired
    EmployeeDeo employeeDeo;
    
    //save an employee in to database
    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee empl){
    
        return employeeDeo.save(empl);
    
    }
    
    //Get all employee
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
    
     return employeeDeo.findAll();
    
    }
    
    
    //get employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Long> getEmployeeById(@PathVariable(value="id") Long id){
    
        Employee emp = employeeDeo.findById(id);
        if(id==null){
        
            return ResponseEntity.notFound().build();
        
        }
        return ResponseEntity.ok().body(id);
        
    }
    

//update an employee by id
    
  @PostMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable(value="id") Long id , @Valid @RequestBody Employee employeeDetails){
    
    Employee emp = employeeDeo.findById(id);
    
     if(id==null){
        
            return ResponseEntity.notFound().build();
        
        }
     emp.setName(employeeDetails.getName());
     emp.setDesignation(employeeDetails.getDesignation());
     emp.setExpertise(employeeDetails.getExpertise());
        
     //save changes
     Employee updateEmployee = employeeDeo.save(emp);
     
     return ResponseEntity.ok().body(updateEmployee);
    }

    
    
    //Delete an employee
    
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployees(@PathVariable(value="id") Long id){
    
        Employee emp = employeeDeo.findById(id);
    
     if(id==null){
        
            return ResponseEntity.notFound().build();
        
        }
      employeeDeo.delete(emp);
        return ResponseEntity.ok().build();
      
    
    }
    
    
    
    
}
