package com.example.shrtnr.app.repository;

import com.example.shrtnr.app.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Integer> {
}
