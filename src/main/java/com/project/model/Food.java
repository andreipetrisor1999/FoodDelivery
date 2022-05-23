package com.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pizza")
public class Food {
    private static final String SEQ = "pizza_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "food_type_id", nullable = false)
    private FoodType foodType;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ingredients", nullable = false)
    private String ingredients;

    @Column(name = "price", nullable = false)
    private Long price;

}
