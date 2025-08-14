package com.geektracker.infra.repository;

import com.geektracker.domain.model.Collection;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CollectionRepository extends JpaRepository<Collection, Long> {

    @EntityGraph(attributePaths = "items")
    Optional<Collection> findById(Long id);
}
