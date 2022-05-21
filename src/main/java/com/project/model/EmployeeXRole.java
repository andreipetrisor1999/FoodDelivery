package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee_x_role")
public class EmployeeXRole {
    private Integer id;
    private Employee employee;
    private Role role;
}
