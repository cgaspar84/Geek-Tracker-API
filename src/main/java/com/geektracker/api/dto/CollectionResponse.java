package com.geektracker.api.dto;

import com.geektracker.domain.model.Category;
import java.util.List;

public record CollectionResponse(
        Long id,
        String title,
        Integer year,
        Category category,
        Double personalRating,
        String imageUrl,
        List<ItemResponse> items
) {}
