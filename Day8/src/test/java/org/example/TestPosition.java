package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPosition {
    @Test
    public void minusTest() {
        Position position1 = new Position(1, 2);
        Position position2 = new Position(2, 3);
        Position expected = new Position(-1, -1);

        Position actual = position1.minus(position2);

        assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        Position position1 = new Position(1, 2);
        Position position2 = new Position(2, 3);
        Position expected = new Position(3, 5);

        Position actual = position1.add(position2);

        assertEquals(expected, actual);
    }

    @Test
    public void equalsTest() {
        Position position1 = new Position(1, 2);
        Position position2 = new Position(1, 2);
        boolean expected = true;

        boolean actual = position1.equals(position2);

        assertEquals(expected, actual);
    }

    @Test
    public void isOutOfBoundsReturnsFalseLowerLimitTest(){
        Position position1 = new Position(0, 0);
        boolean expected = false;
        boolean actual = position1.isOutOfBounds(49);
        assertEquals(expected, actual);
    }

    @Test
    public void isOutOfBoundsReturnsFalseUpperLimitTest(){
        Position position1 = new Position(49, 49);
        boolean expected = false;
        boolean actual = position1.isOutOfBounds(49);
        assertEquals(expected, actual);
    }

    @Test
    public void isOutOfBoundsReturnsTrueLowRowTest(){
        Position position1 = new Position(-1, 2);
        boolean expected = true;
        boolean actual = position1.isOutOfBounds(49);
        assertEquals(expected, actual);
    }

    @Test
    public void isOutOfBoundsReturnsTrueLowColTest(){
        Position position1 = new Position(0, -1);
        boolean expected = true;
        boolean actual = position1.isOutOfBounds(49);
        assertEquals(expected, actual);
    }

    @Test
    public void isOutOfBoundsReturnsTrueHighRowTest(){
        Position position1 = new Position(50, 0);
        boolean expected = true;
        boolean actual = position1.isOutOfBounds(49);
        assertEquals(expected, actual);
    }

    @Test
    public void isOutOfBoundsReturnsTrueHighColTest(){
        Position position1 = new Position(0, 50);
        boolean expected = true;
        boolean actual = position1.isOutOfBounds(49);
        assertEquals(expected, actual);
    }
}
