package com.example.coworkingbooking.repositories;

import com.example.coworkingbooking.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
