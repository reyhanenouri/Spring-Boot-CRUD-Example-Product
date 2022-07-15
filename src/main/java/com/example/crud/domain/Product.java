package com.example.crud.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "Product")
@Table (name = "product")
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "product_sequence"
    )
    @Column (name = "id")
    private int id;

    @Column (name = "product_name")
    private String name;

    @Column (name = "price")
    private double price;
}
