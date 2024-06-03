package com.example.trip_expenses_management.repository;

import com.example.trip_expenses_management.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {


    List<Trip> findByDestination(String destination);
    List<Trip> findByStartDateBetween(LocalDate startDate1,LocalDate startDate2);
}

