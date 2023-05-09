package com.racing.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.exception.InvalidPositionException;
import racing.model.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PositionTest {

    @Test
    @DisplayName("포지션은 음수불가")
    void test1() {
        assertThrows(InvalidPositionException.class, () -> new Position(-1));
    }

    @Test
    @DisplayName("car.move()시 포지션 증가 확인")
    void test2() {
        assertEquals(new Position(1), new Position().move());
    }
}