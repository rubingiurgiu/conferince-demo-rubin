package com.pluralsight.conferincedemo.repositories;

import com.pluralsight.conferincedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
