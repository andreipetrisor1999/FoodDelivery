package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee_x_table")
public class EmployeeXCompany {
    private Integer id;
    private Employee employee;
    private Company company;
}
