package com.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee_x_role")
public class EmployeeXRole {
    private static final String SEQ = "employee_x_role_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "role_id", nullable = false)
    private Role role;
}
