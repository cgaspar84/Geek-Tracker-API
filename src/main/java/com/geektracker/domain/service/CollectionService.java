package com.geektracker.domain.service;

import com.geektracker.api.dto.CollectionResponse;
import com.geektracker.api.dto.CreateCollectionRequest;
import com.geektracker.api.mapper.CollectionMapper;
import com.geektracker.infra.repository.CollectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CollectionService {

    private final CollectionRepository collectionRepository;
    private final CollectionMapper collectionMapper;

    public CollectionResponse createCollection(CreateCollectionRequest request) {
        var collection = collectionMapper.toEntity(request);
        var saved = collectionRepository.save(collection);
        return collectionMapper.toResponse(saved);
    }

    public Page<CollectionResponse> listCollections(Pageable pageable) {
        return collectionRepository.findAll(pageable)
                .map(collectionMapper::toResponse);
    }
}
