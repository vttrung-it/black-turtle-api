package com.java.mapper;

import com.java.domain.DTO.ProductDetailDTO;
import com.java.domain.entity.ProductDetail;
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
public class ProductDetailMapperImpl implements ProductDetailMapper {

    @Override
    public ProductDetail toEntity(ProductDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProductDetail productDetail = new ProductDetail();

        productDetail.setCode( dto.getCode() );
        productDetail.setColor( dto.getColor() );
        productDetail.setPrice( dto.getPrice() );
        productDetail.setSize( dto.getSize() );
        productDetail.setDescription( dto.getDescription() );
        productDetail.setCodeProduct( dto.getCodeProduct() );

        return productDetail;
    }

    @Override
    public ProductDetailDTO toDto(ProductDetail entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDetailDTO productDetailDTO = new ProductDetailDTO();

        productDetailDTO.setCode( entity.getCode() );
        productDetailDTO.setColor( entity.getColor() );
        productDetailDTO.setPrice( entity.getPrice() );
        productDetailDTO.setSize( entity.getSize() );
        productDetailDTO.setDescription( entity.getDescription() );
        productDetailDTO.setCodeProduct( entity.getCodeProduct() );

        return productDetailDTO;
    }

    @Override
    public List<ProductDetail> toEntity(List<ProductDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ProductDetail> list = new ArrayList<ProductDetail>( dtoList.size() );
        for ( ProductDetailDTO productDetailDTO : dtoList ) {
            list.add( toEntity( productDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductDetailDTO> toDto(List<ProductDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductDetailDTO> list = new ArrayList<ProductDetailDTO>( entityList.size() );
        for ( ProductDetail productDetail : entityList ) {
            list.add( toDto( productDetail ) );
        }

        return list;
    }
}
