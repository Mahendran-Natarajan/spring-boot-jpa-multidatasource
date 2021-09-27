package com.example.demo.repository.secondary;

import com.example.demo.model.secondary.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {


}
