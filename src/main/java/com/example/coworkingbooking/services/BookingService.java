// BookingService.java
package com.example.coworkingbooking.services;

import com.example.coworkingbooking.entities.Booking;
import com.example.coworkingbooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking create(Booking booking) { return bookingRepository.save(booking); }
    public List<Booking> getByGuest(String guestName) { return bookingRepository.findByGuestName(guestName); }
}