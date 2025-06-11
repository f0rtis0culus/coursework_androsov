package com.example.coworkingbooking.repositories;

import com.example.coworkingbooking.entities.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Long> {
}