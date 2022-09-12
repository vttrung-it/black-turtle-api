package com.java.mapper;

import java.util.List;

public interface BaseEntityMapper<D, E>  {

    public E toEntity(D dto);

    public D toDto(E entity);

    public List<E> toEntity(List<D> dtoList);

    public List <D> toDto(List<E> entityList);
}
