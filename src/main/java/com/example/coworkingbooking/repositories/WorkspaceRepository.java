package com.example.coworkingbooking.repositories;

import com.example.coworkingbooking.entities.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
}
