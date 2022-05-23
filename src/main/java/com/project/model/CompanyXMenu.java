package com.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company_x_menu")
public class CompanyXMenu {
    private static final String SEQ = "company_x_menu_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "company_id", nullable = false)
    private Company company;

    @Column(name = "menu_id", nullable = false)
    private Menu menu;
}
