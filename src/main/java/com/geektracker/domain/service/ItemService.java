package com.geektracker.domain.service;

import com.geektracker.api.dto.CreateItemRequest;
import com.geektracker.api.dto.ItemResponse;
import com.geektracker.api.mapper.ItemMapper;
import com.geektracker.domain.model.Category;
import com.geektracker.infra.repository.CollectionRepository;
import com.geektracker.infra.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final CollectionRepository collectionRepository;
    private final ItemMapper itemMapper;

    public ItemResponse addItemToCollection(Long collectionId, CreateItemRequest request) {
        var collection = collectionRepository.findById(collectionId)
                .orElseThrow(() -> new IllegalArgumentException("Collection not found"));
        var item = itemMapper.toEntity(request);
        item.setCollection(collection);
        var saved = itemRepository.save(item);
        return itemMapper.toResponse(saved);
    }

    public List<ItemResponse> getItems(Long collectionId, Category category, Integer year) {
        var items = itemRepository.findByFilters(collectionId, category, year);
        return itemMapper.toResponseList(items);
    }
}
