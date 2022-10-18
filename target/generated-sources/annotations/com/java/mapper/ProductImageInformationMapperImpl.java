package com.java.mapper;

import com.java.domain.DTO.ProductImageInformationDTO;
import com.java.domain.entity.ProductImageInformation;
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
public class ProductImageInformationMapperImpl implements ProductImageInformationMapper {

    @Override
    public ProductImageInformation toEntity(ProductImageInformationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProductImageInformation productImageInformation = new ProductImageInformation();

        productImageInformation.setCode( dto.getCode() );
        productImageInformation.setImage( dto.getImage() );
        productImageInformation.setCodeProduct( dto.getCodeProduct() );
        productImageInformation.setCodeProductDetail( dto.getCodeProductDetail() );

        return productImageInformation;
    }

    @Override
    public ProductImageInformationDTO toDto(ProductImageInformation entity) {
        if ( entity == null ) {
            return null;
        }

        ProductImageInformationDTO productImageInformationDTO = new ProductImageInformationDTO();

        productImageInformationDTO.setCode( entity.getCode() );
        productImageInformationDTO.setImage( entity.getImage() );
        productImageInformationDTO.setCodeProduct( entity.getCodeProduct() );
        productImageInformationDTO.setCodeProductDetail( entity.getCodeProductDetail() );

        return productImageInformationDTO;
    }

    @Override
    public List<ProductImageInformation> toEntity(List<ProductImageInformationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ProductImageInformation> list = new ArrayList<ProductImageInformation>( dtoList.size() );
        for ( ProductImageInformationDTO productImageInformationDTO : dtoList ) {
            list.add( toEntity( productImageInformationDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductImageInformationDTO> toDto(List<ProductImageInformation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductImageInformationDTO> list = new ArrayList<ProductImageInformationDTO>( entityList.size() );
        for ( ProductImageInformation productImageInformation : entityList ) {
            list.add( toDto( productImageInformation ) );
        }

        return list;
    }
}
