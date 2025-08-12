package com.geektracker.api.dto;

import com.geektracker.domain.model.Category;
import jakarta.validation.constraints.*;

public record CreateItemRequest(
        @NotBlank @Size(max = 255) String title,
        @NotNull @Min(0) Integer year,
        @NotNull Category category,
        @NotNull @DecimalMin("0.0") @DecimalMax("5.0") Double personalRating,
        @NotBlank String imageUrl
) {}
