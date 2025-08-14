package com.geektracker.infra.repository;

import com.geektracker.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByCollectionId(Long collectionId);
}
