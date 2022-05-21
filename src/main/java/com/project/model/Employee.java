package com.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Date employedDate;
    private Company company;
    private Long salary;
}
