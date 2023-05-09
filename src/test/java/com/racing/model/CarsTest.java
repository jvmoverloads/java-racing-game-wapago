package com.racing.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.exception.InvalidCarNamesException;
import racing.model.Cars;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"kane", ",wevnk,vwien", "vsdvd,vewvr,nikn,", "vwet"})
    void carsTest(String invalidCarNames) {
        assertThrows(InvalidCarNamesException.class, () -> new Cars(invalidCarNames));
    }
}