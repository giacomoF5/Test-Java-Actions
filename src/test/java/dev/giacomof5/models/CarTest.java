package dev.giacomof5.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Ferrari", "black");
    }

    @Test
    void testGetBrand() {
        assertEquals("Ferrari", car.getBrand());
    }

    @Test
    void testGetColor() {
        assertEquals("black", car.getColor());
    }

    @Test
    void testSetColor() {
        car.setColor("yellow");
        assertEquals("yellow", car.getColor());
    }
}
