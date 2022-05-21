package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    private Integer id;
    private String name;
}
