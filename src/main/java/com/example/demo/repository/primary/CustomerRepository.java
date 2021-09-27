package com.example.demo.repository.primary;

import com.example.demo.model.primary.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
    // Stream<Customer> findByLastName(String lastName);
//    @Query("select c from Customer c")
//    Stream<Customer> streamAll();
}
