package com.obectron.core.address;

import com.obectron.core.address.AddressType;
import com.obectron.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

import static com.obectron.common.utils.Constants.*;

@Data
@Entity
@SuperBuilder
@Table(name = ADDRESSES_TABLE)
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_COLUMN)
    private UUID id;

    @Column(name = TYPE_COLUMN)
    private AddressType type;

    @Column(name = COUNTRY_COLUMN)
    private String country;

    @Column(name = ZIP_COLUMN)
    private String zip;

    @Column(name = CITY_COLUMN)
    private String city;

    @Column(name = QUARTER_COLUMN)
    private String quarter;

    @Column(name = STREET_COLUMN)
    private String street;

    @Column(name = STREET_NUMBER_COLUMN)
    private String streetNumber;

    @Column(name = BLOCK_COLUMN)
    private String block;

    @Column(name = FLOOR_COLUMN)
    private String floor;

    @Column(name = FLAT_COLUMN)
    private String flat;
}
