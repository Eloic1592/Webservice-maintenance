package com.service.maintenance.repository;

import com.service.maintenance.model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuggestionRepository extends JpaRepository<Suggestion, Integer> {
    List<Suggestion> findAllByEtat(Integer etat);
}