package com.java.mapper;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.entity.CategoryProduct;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-15T23:26:51+0700",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class CategoryProductMapperImpl implements CategoryProductMapper {

    @Override
    public CategoryProduct toEntity(CategoryProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryProduct categoryProduct = new CategoryProduct();

        categoryProduct.setId( dto.getId() );
        categoryProduct.setName( dto.getName() );
        categoryProduct.setCode( dto.getCode() );
        categoryProduct.setBrandName( dto.getBrandName() );
        categoryProduct.setOrigin( dto.getOrigin() );
        categoryProduct.setAddress( dto.getAddress() );
        categoryProduct.setDescription( dto.getDescription() );

        return categoryProduct;
    }

    @Override
    public CategoryProductDTO toDto(CategoryProduct entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryProductDTO categoryProductDTO = new CategoryProductDTO();

        categoryProductDTO.setId( entity.getId() );
        categoryProductDTO.setName( entity.getName() );
        categoryProductDTO.setCode( entity.getCode() );
        categoryProductDTO.setBrandName( entity.getBrandName() );
        categoryProductDTO.setOrigin( entity.getOrigin() );
        categoryProductDTO.setAddress( entity.getAddress() );
        categoryProductDTO.setDescription( entity.getDescription() );

        return categoryProductDTO;
    }

    @Override
    public List<CategoryProduct> toEntity(List<CategoryProductDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CategoryProduct> list = new ArrayList<CategoryProduct>( dtoList.size() );
        for ( CategoryProductDTO categoryProductDTO : dtoList ) {
            list.add( toEntity( categoryProductDTO ) );
        }

        return list;
    }

    @Override
    public List<CategoryProductDTO> toDto(List<CategoryProduct> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryProductDTO> list = new ArrayList<CategoryProductDTO>( entityList.size() );
        for ( CategoryProduct categoryProduct : entityList ) {
            list.add( toDto( categoryProduct ) );
        }

        return list;
    }
}
