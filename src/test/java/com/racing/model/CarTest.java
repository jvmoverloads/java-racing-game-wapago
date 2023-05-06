package com.racing.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.model.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    @DisplayName("움직일 수 없으면 위치값 0")
    void test1() {
        Car car = new Car("chan");
        car.move(() -> false);

        assertEquals(0, car.getCurrentPosition());
    }

    @Test
    @DisplayName("움직일 수 있으면 위치값 1")
    void test2() {
        Car car = new Car("chan");
        car.move(() -> true);

        assertEquals(1, car.getCurrentPosition());
    }

}