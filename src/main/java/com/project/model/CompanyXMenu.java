package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "company_x_menu")
public class CompanyXMenu {
    private Integer id;
    private Company comapny;
    private Menu menu;
}
