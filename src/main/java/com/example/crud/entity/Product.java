package com.example.crud.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "product")
public class Product {
    @Id
    @GeneratedValue
    @Column (name = "id")
    private int id;

    @Column (name = "name")
    private String name;

    @Column (name = "price")
    private double price;
}
