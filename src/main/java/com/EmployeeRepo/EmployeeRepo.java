/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EmployeeRepo;

import com.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author collins
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    
}
