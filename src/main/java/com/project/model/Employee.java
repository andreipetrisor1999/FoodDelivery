package com.project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    private static final String SEQ = "employee_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "contract_number", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "employed_date", nullable = false)
    private Date employedDate;

    @Column(name = "company_id", nullable = false)
    private Company company;

    @Column(name = "salary", nullable = false)
    private Long salary;
}
