package com.project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "company")
public class Company {
    private static final String SEQ = "company_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "menu_id", nullable = false)
    private Menu menu;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

}
