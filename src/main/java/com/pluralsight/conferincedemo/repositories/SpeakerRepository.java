package com.pluralsight.conferincedemo.repositories;

import com.pluralsight.conferincedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
