package com.geektracker.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer year;

    @Enumerated(EnumType.STRING)
    private Category category;

    private Double personalRating;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;
}
