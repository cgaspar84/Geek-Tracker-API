package com.geektracker.api.mapper;

import com.geektracker.api.dto.CreateItemRequest;
import com.geektracker.api.dto.ItemResponse;
import com.geektracker.domain.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "collection", ignore = true)
    Item toEntity(CreateItemRequest request);
    ItemResponse toResponse(Item item);
    List<ItemResponse> toResponseList(List<Item> items);
}
