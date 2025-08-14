package com.geektracker.api.mapper;

import com.geektracker.api.dto.CollectionResponse;
import com.geektracker.api.dto.CreateCollectionRequest;
import com.geektracker.domain.model.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface CollectionMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "items", ignore = true)
    Collection toEntity(CreateCollectionRequest request);
    CollectionResponse toResponse(Collection collection);
    List<CollectionResponse> toResponseList(List<Collection> collections);
}
