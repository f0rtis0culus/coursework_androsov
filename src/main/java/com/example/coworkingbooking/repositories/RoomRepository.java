package com.example.coworkingbooking.repositories;

import com.example.coworkingbooking.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByWorkspaceId(Long workspaceId);


}
