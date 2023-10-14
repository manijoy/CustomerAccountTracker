package com.cat.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cat.main.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
