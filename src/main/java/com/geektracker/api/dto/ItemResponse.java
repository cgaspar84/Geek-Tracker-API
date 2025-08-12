package com.geektracker.api.dto;

import com.geektracker.domain.model.Category;

public record ItemResponse(
        Long id,
        String title,
        Integer year,
        Category category,
        Double personalRating,
        String imageUrl
) {}
