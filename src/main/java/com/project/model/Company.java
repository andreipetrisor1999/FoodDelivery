package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    private Integer id;
    private Menu menu;
    private List<Employee> employeeList;
}
