package com.obectron.persistence.address;

import com.obectron.core.address.AddressType;
import com.obectron.persistence.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Builder
@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity implements BaseEntity {

    @Id
    private UUID id;
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
