package com.bank.profile.dto;

import com.bank.profile.entity.ActualRegistrationEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * ДТО для сущности {@link ActualRegistrationEntity}
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ActualRegistrationDto implements Serializable {

    private Long id;

    private String country;

    private String region;

    private String city;

    private String district;

    private String locality;

    private String street;

    private String houseNumber;

    private String houseBlock;

    private String flatNumber;

    private Long index;
}
