package com.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
public class Client {
    private Integer id;
    private String name;
    private String address;

}
