package com.obectron.core.address;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String id;
    private AddressType type;
    private String country;
    private String zip;
    private String city;
    private String quarter;
    private String street;
    private String number;
    private String block;
    private String floor;
    private String apartment;

}
