package com.java.mapper;

import com.java.domain.DTO.CategoryLinkDTO;
import com.java.domain.entity.CategoryLink;
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
public class CategoryLinkMapperImpl implements CategoryLinkMapper {

    @Override
    public CategoryLink toEntity(CategoryLinkDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryLink categoryLink = new CategoryLink();

        categoryLink.setId( dto.getId() );
        categoryLink.setName( dto.getName() );
        categoryLink.setImage( dto.getImage() );
        categoryLink.setLink( dto.getLink() );
        categoryLink.setDescription( dto.getDescription() );

        return categoryLink;
    }

    @Override
    public CategoryLinkDTO toDto(CategoryLink entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryLinkDTO categoryLinkDTO = new CategoryLinkDTO();

        categoryLinkDTO.setId( entity.getId() );
        categoryLinkDTO.setName( entity.getName() );
        categoryLinkDTO.setImage( entity.getImage() );
        categoryLinkDTO.setLink( entity.getLink() );
        categoryLinkDTO.setDescription( entity.getDescription() );

        return categoryLinkDTO;
    }

    @Override
    public List<CategoryLink> toEntity(List<CategoryLinkDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CategoryLink> list = new ArrayList<CategoryLink>( dtoList.size() );
        for ( CategoryLinkDTO categoryLinkDTO : dtoList ) {
            list.add( toEntity( categoryLinkDTO ) );
        }

        return list;
    }

    @Override
    public List<CategoryLinkDTO> toDto(List<CategoryLink> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryLinkDTO> list = new ArrayList<CategoryLinkDTO>( entityList.size() );
        for ( CategoryLink categoryLink : entityList ) {
            list.add( toDto( categoryLink ) );
        }

        return list;
    }
}
