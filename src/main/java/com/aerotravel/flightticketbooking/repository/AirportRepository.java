package com.aerotravel.flightticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerotravel.flightticketbooking.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
