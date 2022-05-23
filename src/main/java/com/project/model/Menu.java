package com.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "menu")
public class Menu {
    private static final String SEQ = "menu_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "welcomeMessage")
    private String welcomeMessage;

    @Column(name = "has_pizza", nullable = false)
    private Boolean hasPizza;

    @Column(name = "has_soup", nullable = false)
    private Boolean hasSoup;

    @Column(name = "has_burgers", nullable = false)
    private Boolean hasBurgers;

    @Column(name = "has_desert", nullable = false)
    private Boolean hasDesert;
}
