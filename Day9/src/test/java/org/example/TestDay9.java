package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

import static org.example.Day9.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay9 {

    @Test
    public void test() {
        String[] args = {"hi", "bye"};
        Day9.main(args);
    }

    @Test
    public void convertInputToDiskSpaceTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {1, 2, 3, 4};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, -1, -1, 1, 1, 1, -1, -1, -1, -1};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = convertInputToDiskSpace(input);

        assertEquals(expected, actual);
    }

    @Test
    public void convertInputToDiskSpaceWithZeroesTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {1, 0, 3, 4};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, 1, 1, 1, -1, -1, -1, -1};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = convertInputToDiskSpace(input);

        assertEquals(expected, actual);
    }

    @Test
    public void compressDiskSpaceSimpleTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, -1, 1};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, 1};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = compressDiskSpace(input);

        assertEquals(expected, actual);
    }

    @Test
    public void compressDiskSpaceLastIndexIsSpaceTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, -1, 1, -1};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, 1};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = compressDiskSpace(input);

        assertEquals(expected, actual);
    }

    @Test
    public void compressDiskSpaceMovesASingleElementTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, -1, 8, 8, 9, 9};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, 9, 8, 8, 9};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = compressDiskSpace(input);

        assertEquals(expected, actual);
    }


    @Test
    public void compressDiskSpaceDoesNothingWhenNoSpace(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, 1, 1, 1};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, 1, 1, 1};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = compressDiskSpace(input);

        assertEquals(expected, actual);
    }

    @Test
    public void compressDiskSpaceDoesNothingWhenNoFilesAfterSpace(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, 1, 1, 1, -1, -1, -1, -1};
        Collections.addAll(input, inputList);
        ArrayList<Integer> expected = new ArrayList<>();
        Integer[] expectedList = {0, 1, 1, 1};
        Collections.addAll(expected, expectedList);

        ArrayList<Integer> actual = compressDiskSpace(input);

        assertEquals(expected, actual);
    }

    @Test
    public void findLastFileIDUpToLastIndexIsSpaceTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, 1, -1};
        Collections.addAll(input, inputList);
        int inputLastIndex = 2;

        int expectedNextLastIndex = 1;
        int actual = Day9.findLastFileIDUpTo(input, inputLastIndex);

        assertEquals(expectedNextLastIndex, actual);
    }


    @Test
    public void findLastFileIDUpToLastIndexIsFileTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, 1, -1, 1, 2, -1, 3};
        Collections.addAll(input, inputList);
        int inputLastIndex = 6;

        int expectedNextLastIndex = 6;
        int actual = Day9.findLastFileIDUpTo(input, inputLastIndex);

        assertEquals(expectedNextLastIndex, actual);
    }


    @Test
    public void findLastFileIDUpToFollowOnFromPreviousTest(){
        ArrayList<Integer> input = new ArrayList<>();
        Integer[] inputList = {0, 1, 3, 1, 2, -1, -1};
        Collections.addAll(input, inputList);
        int inputLastIndex = 6;

        int expectedNextLastIndex = 4;
        int actual = Day9.findLastFileIDUpTo(input, inputLastIndex);

        assertEquals(expectedNextLastIndex, actual);
    }

    @Test
    public void exampleTest() {
        String inputString = "2333133121414131402";
        ArrayList<Integer> input = Reader.convertInputToIntArray(inputString);
        ArrayList<Integer> diskSpace = convertInputToDiskSpace(input);
        ArrayList<Integer> compressedDisk = compressDiskSpace(diskSpace);
        System.out.println(compressedDisk);
        BigInteger actual = calculateCheckSum(compressedDisk);

        assertEquals(BigInteger.valueOf(1928), actual);

    }


}
