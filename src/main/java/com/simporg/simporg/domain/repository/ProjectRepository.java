package com.simporg.simporg.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simporg.simporg.domain.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
    
}
