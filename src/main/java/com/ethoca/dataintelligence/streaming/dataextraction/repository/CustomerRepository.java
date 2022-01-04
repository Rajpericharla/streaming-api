package com.ethoca.dataintelligence.streaming.dataextraction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ethoca.dataintelligence.streaming.dataextraction.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
