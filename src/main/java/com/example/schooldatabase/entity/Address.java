package com.example.schooldatabase.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String city;
    private String pincode;
    private String houseNumber;
}
