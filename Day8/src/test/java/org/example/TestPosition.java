package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void plusTest() {
        Position position1 = new Position(1, 2);
        Position position2 = new Position(2, 3);
        Position expected = new Position(3, 5);

        Position actual = position1.plus(position2);

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

    @Test
    public void HighestCommonFactorIs1Test(){
        int expected = 1;
        int actual = Position.HighestCommonFactor(3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void HighestCommonFactorIsNegative1Test(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Position.HighestCommonFactor(-3, -5));
        assertTrue(exception.getMessage().contains("negative numbers not allowed"));

    }

    @Test
    public void HighestCommonFactorIs2Test(){
        int expected = 2;
        int actual = Position.HighestCommonFactor(10, 12);
        assertEquals(expected, actual);
    }

    @Test
    public void HighestCommonFactorIs6Test(){
        int expected = 6;
        int actual = Position.HighestCommonFactor(12, 18);
        assertEquals(expected, actual);
    }

    @Test
    public void HighestCommonFactorIs20Test(){
        int expected = 20;
        int actual = Position.HighestCommonFactor(100, 40);
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference1To1Test(){
        Position difference = new Position(5, 5);
        Position expected = new Position(1, 1);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference1To1NegativeTest(){
        Position difference = new Position(-5, -5);
        Position expected = new Position(-1, -1);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference2to1Test(){
        Position difference = new Position(4, 2);
        Position expected = new Position(2, 1);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference1to2Test(){
        Position difference = new Position(2, 4);
        Position expected = new Position(1, 2);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference1to2NegativeTest(){
        Position difference = new Position(-2, -4);
        Position expected = new Position(-1, -2);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference3to2Test(){
        Position difference = new Position(18, 12);
        Position expected = new Position(3, 2);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifferenceNegative3to2Test(){
        Position difference = new Position(-18, -12);
        Position expected = new Position(-3, -2);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

    @Test
    public void findMinDifference2to3Test(){
        Position difference = new Position(12, 18);
        Position expected = new Position(2, 3);

        Position actual = difference.findMinDifference();
        assertEquals(expected, actual);
    }

}
