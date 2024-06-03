package com.example.trip_expenses_management.repository;

import com.example.trip_expenses_management.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}

