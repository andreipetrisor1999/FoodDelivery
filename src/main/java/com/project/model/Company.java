package com.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "company")
public class Company {
    private Integer id;
    private Menu menu;
    private List<Employee> employeeList;
}
