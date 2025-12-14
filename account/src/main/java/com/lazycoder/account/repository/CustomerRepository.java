package com.lazycoder.account.repository;

import com.lazycoder.account.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // derived name method
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
