// RoomService.java
package com.example.coworkingbooking.services;

import com.example.coworkingbooking.entities.Room;
import com.example.coworkingbooking.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getByHotel(Long hotelId) { return roomRepository.findByHotelId(hotelId); }
    public Room create(Room room) { return roomRepository.save(room); }
}