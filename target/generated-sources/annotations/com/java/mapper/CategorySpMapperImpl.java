package com.java.mapper;

import com.java.domain.DTO.CategorySpDTO;
import com.java.domain.entity.CategorySp;
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
public class CategorySpMapperImpl implements CategorySpMapper {

    @Override
    public CategorySp toEntity(CategorySpDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategorySp categorySp = new CategorySp();

        categorySp.setId( dto.getId() );
        categorySp.setName( dto.getName() );
        categorySp.setDescription( dto.getDescription() );

        return categorySp;
    }

    @Override
    public CategorySpDTO toDto(CategorySp entity) {
        if ( entity == null ) {
            return null;
        }

        CategorySpDTO categorySpDTO = new CategorySpDTO();

        categorySpDTO.setId( entity.getId() );
        categorySpDTO.setName( entity.getName() );
        categorySpDTO.setDescription( entity.getDescription() );

        return categorySpDTO;
    }

    @Override
    public List<CategorySp> toEntity(List<CategorySpDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CategorySp> list = new ArrayList<CategorySp>( dtoList.size() );
        for ( CategorySpDTO categorySpDTO : dtoList ) {
            list.add( toEntity( categorySpDTO ) );
        }

        return list;
    }

    @Override
    public List<CategorySpDTO> toDto(List<CategorySp> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategorySpDTO> list = new ArrayList<CategorySpDTO>( entityList.size() );
        for ( CategorySp categorySp : entityList ) {
            list.add( toDto( categorySp ) );
        }

        return list;
    }
}
