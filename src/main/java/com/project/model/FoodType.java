package com.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "food_type")
public class FoodType {
    private static final String SEQ = "food_type_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "food_type", nullable = false)
    private String foodType;
}
