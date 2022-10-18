package com.java.mapper;

import com.java.domain.DTO.ProductDTO;
import com.java.domain.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-17T16:51:18+0700",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setCode( dto.getCode() );
        product.setName( dto.getName() );
        product.setImage( dto.getImage() );
        product.setRate( dto.getRate() );
        product.setDescription( dto.getDescription() );
        product.setCodeCategoryProduct( dto.getCodeCategoryProduct() );

        return product;
    }

    @Override
    public ProductDTO toDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setCode( entity.getCode() );
        productDTO.setName( entity.getName() );
        productDTO.setImage( entity.getImage() );
        productDTO.setRate( entity.getRate() );
        productDTO.setDescription( entity.getDescription() );
        productDTO.setCodeCategoryProduct( entity.getCodeCategoryProduct() );

        return productDTO;
    }

    @Override
    public List<Product> toEntity(List<ProductDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( dtoList.size() );
        for ( ProductDTO productDTO : dtoList ) {
            list.add( toEntity( productDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductDTO> toDto(List<Product> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( entityList.size() );
        for ( Product product : entityList ) {
            list.add( toDto( product ) );
        }

        return list;
    }
}
