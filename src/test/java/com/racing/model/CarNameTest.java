package com.racing.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.exception.InvalidCarNameException;
import racing.model.CarName;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CarNameTest {

    @Test
    @DisplayName("Car 이름은 5자를 초과할 수 없다.")
    void test() {
        // given
        String invalidCarName = "123456";

        // then
        assertThrows(InvalidCarNameException.class, () -> new CarName(invalidCarName) );
    }

}