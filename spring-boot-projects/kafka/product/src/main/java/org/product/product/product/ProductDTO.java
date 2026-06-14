package org.product.product.product;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDTO {

    private Long id;

    private String  productName;

    private Double price;

    private Double stock;
}
