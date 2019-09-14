package com.Employee;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author collins
 */

@Entity
@Table(name = "Employees")
@EntityListeners(AuditingEntityListener.class)

public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    private String name;
    
    @NotBlank   
    private String designation;
    @NotBlank       
    private String expertise;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date createdAt;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDesignation () {
        return designation;
    }

    public void setDesignation (String designation) {
        this.designation = designation;
    }

    public String getExpertise () {
        return expertise;
    }

    public void setExpertise (String expertise) {
        this.expertise = expertise;
    }

    public Date getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt (Date createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
