package org.product.product.product;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(ProductDAO productDAO);

    ProductDAO toDAO(ProductDTO productDTO);

    List<ProductDTO> toListDTO(List<ProductDAO> productDAO);
}
