package org.product.product.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("product/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable() Long id) {
        ProductDTO product =  productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("product")
    public ResponseEntity<List<ProductDTO>> getAllProduct() {
        List<ProductDTO> product =  productService.getAllProduct();
        return ResponseEntity.ok(product);
    }

    @PostMapping("product")
    public ResponseEntity<ProductDTO> getProductById(@RequestBody ProductDTO productDTO) {
        ProductDTO product =  productService.createProdcut(productDTO);
        return ResponseEntity.ok(product);
    }
}
