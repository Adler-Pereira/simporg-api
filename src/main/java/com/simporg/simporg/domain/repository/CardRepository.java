package com.simporg.simporg.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simporg.simporg.domain.entity.Card;

public interface CardRepository extends JpaRepository<Card, UUID> {

}
