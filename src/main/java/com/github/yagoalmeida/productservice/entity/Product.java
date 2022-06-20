package com.github.yagoalmeida.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "product")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
}
