package org.product.product.product;

import lombok.RequiredArgsConstructor;
import org.product.product.product.util.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductDTO getProductById(Long id) {
        Optional<ProductDAO> productDAO = productRepository.findById(id);

        if (productDAO.isPresent())
            return ProductMapper.INSTANCE.toDTO(productDAO.get());
        else
            throw new ProductNotFoundException("Product Not Found");
    }

    public ProductDTO createProdcut(ProductDTO productDTO) {
        return ProductMapper.INSTANCE.toDTO(productRepository.save(ProductMapper.INSTANCE.toDAO(productDTO)));
    }


    public List<ProductDTO> getAllProduct() {
        List<ProductDAO> productDAO = productRepository.findAll();
        return ProductMapper.INSTANCE.toListDTO(productDAO);
    }
}
