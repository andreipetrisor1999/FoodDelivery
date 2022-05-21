package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
    private Integer id;
    private String name;
    private String address;

}
