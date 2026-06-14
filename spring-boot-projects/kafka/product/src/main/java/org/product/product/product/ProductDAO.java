package org.product.product.product;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class ProductDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String  productName;

    @Column(name = "price")
    private Double price;

    @Column(name = "stock")
    private Double stock;
}
