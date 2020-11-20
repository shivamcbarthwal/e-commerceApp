package com.shopping.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "product_category")

@Getter
@Setter

public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
