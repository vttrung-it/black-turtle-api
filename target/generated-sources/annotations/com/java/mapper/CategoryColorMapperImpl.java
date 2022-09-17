package com.java.mapper;

import com.java.domain.DTO.CategoryColorDTO;
import com.java.domain.entity.CategoryColor;
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
public class CategoryColorMapperImpl implements CategoryColorMapper {

    @Override
    public CategoryColor toEntity(CategoryColorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryColor categoryColor = new CategoryColor();

        categoryColor.setId( dto.getId() );
        categoryColor.setName( dto.getName() );
        categoryColor.setCodeColor( dto.getCodeColor() );
        categoryColor.setDescription( dto.getDescription() );

        return categoryColor;
    }

    @Override
    public CategoryColorDTO toDto(CategoryColor entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryColorDTO categoryColorDTO = new CategoryColorDTO();

        categoryColorDTO.setId( entity.getId() );
        categoryColorDTO.setName( entity.getName() );
        categoryColorDTO.setCodeColor( entity.getCodeColor() );
        categoryColorDTO.setDescription( entity.getDescription() );

        return categoryColorDTO;
    }

    @Override
    public List<CategoryColor> toEntity(List<CategoryColorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CategoryColor> list = new ArrayList<CategoryColor>( dtoList.size() );
        for ( CategoryColorDTO categoryColorDTO : dtoList ) {
            list.add( toEntity( categoryColorDTO ) );
        }

        return list;
    }

    @Override
    public List<CategoryColorDTO> toDto(List<CategoryColor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryColorDTO> list = new ArrayList<CategoryColorDTO>( entityList.size() );
        for ( CategoryColor categoryColor : entityList ) {
            list.add( toDto( categoryColor ) );
        }

        return list;
    }
}
