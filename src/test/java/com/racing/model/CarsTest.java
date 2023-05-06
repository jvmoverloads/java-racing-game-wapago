package com.racing.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.exception.InvalidCarNamesException;
import racing.model.Cars;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CarsTest {

    @Test
    @DisplayName("자동차이름은 쉼표로 구분되어야 함")
    void test1() {
        String invalidCarNames = "kane";

        assertThrows(InvalidCarNamesException.class, () -> new Cars(invalidCarNames));
    }

    @Test
    @DisplayName("자동차이름은 쉼표로 시작할 수 없습니다")
    void test2() {
        String invalidCarNames = ",wevnk,vwien";
        assertThrows(InvalidCarNamesException.class, () -> new Cars(invalidCarNames));
    }

    @Test
    @DisplayName("자동차이름은 쉼표로 끝날 수 없습니다")
    void test3() {
        String invalidCarNames = "vsdvd,vewvr,nikn,";
        assertThrows(InvalidCarNamesException.class, () -> new Cars(invalidCarNames));
    }

    @Test
    @DisplayName("자동차이름은 최소 2대를 입력해야 합니다.")
    void test4() {
        String invalidCarNames = "vwet";
        assertThrows(InvalidCarNamesException.class, () -> new Cars(invalidCarNames));
    }
}