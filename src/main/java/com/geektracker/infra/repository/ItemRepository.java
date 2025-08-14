package com.geektracker.infra.repository;

import com.geektracker.domain.model.Category;
import com.geektracker.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByCollectionId(Long collectionId);

    @Query("SELECT i FROM Item i WHERE (:collectionId IS NULL OR i.collection.id = :collectionId) AND (:category IS NULL OR i.category = :category) AND (:year IS NULL OR i.year = :year)")
    List<Item> findByFilters(@Param("collectionId") Long collectionId,
                             @Param("category") Category category,
                             @Param("year") Integer year);
}
