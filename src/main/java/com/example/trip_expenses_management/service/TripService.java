package com.example.trip_expenses_management.service;

import com.example.trip_expenses_management.entity.Trip;
import com.example.trip_expenses_management.exception.ResourceNotFoundException;
import com.example.trip_expenses_management.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> findAll() {
        return tripRepository.findAll();
    }

    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }

    public Trip update(Long id, Trip tripDetails) {
        Trip trip = tripRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Trip not found"));
        trip.setDestination(tripDetails.getDestination());
        trip.setStartDate(tripDetails.getStartDate());
        trip.setEndDate(tripDetails.getEndDate());
        return tripRepository.save(trip);
    }

    public void delete(Long id) {
        Trip trip = tripRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Trip not found"));
        tripRepository.delete(trip);
    }
    public Trip getTripById(Long tripId) {
        return tripRepository.findById(tripId)
                .orElseThrow(() -> new ResourceNotFoundException("Trip not found with id: " + tripId));
    }

    public List<Trip> findByDestination(String destination) {
        return tripRepository.findByDestination(destination);
    }

    public List<Trip> findByStartDateBetween(LocalDate startDate1, LocalDate startDate2) {
        return tripRepository.findByStartDateBetween(startDate1, startDate2);
    }
}

