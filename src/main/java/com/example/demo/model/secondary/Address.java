package com.example.demo.model.secondary;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@Setter
@Getter
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstAddress;
    private String secondAddress;

    public Address() {
    }

    public Address(String firstAddress, String secondAddress) {
        this.firstAddress = firstAddress;
        this.secondAddress = secondAddress;
    }

}
