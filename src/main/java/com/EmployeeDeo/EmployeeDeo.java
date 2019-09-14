/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EmployeeDeo;

import com.Employee.Employee;
import com.EmployeeRepo.EmployeeRepo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

/**
 *
 * @author collins
 */

@Service
public class EmployeeDeo {
    
    @Autowired
    EmployeeRepo employeeRepository;
    
    //Save Employee
    public Employee save(Employee empl){
        
    return employeeRepository.save(empl);
    
     }  
    
    //Search Employee
    public List<Employee> findAll(){
        
    return employeeRepository.findAll();
    
    }
    
    //Get All Employee by id
    
     public Employee findById(Long id){
    
    return employeeRepository.findById(id).get();
    
    }
    
    
    
   /* public Employee findById(Long id){
    
    return employeeRepository.findById(id).get();
    
    }
    */

    
    //Delete an Employee
    public void delete(Employee empl){
    
        employeeRepository.delete(empl);
        
    }

  
    
    
    
    
}
