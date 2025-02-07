package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.Day9.compressDiskSpace;
import static org.example.Day9.convertInputToDiskSpace;
import static org.example.Day9OnlineSolution.getDiskRepresentation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOnlineVsMySolution {
    @Test
    public void getDiskTest(){

        ArrayList<Integer> input = Reader.getInput();
        ArrayList<Integer> mine = convertInputToDiskSpace(input);
        ArrayList<Integer> online = getDiskRepresentation(Reader.getInputLineAsString());

        assertEquals(mine, online);
    }

    @Test
    public void compressDiskTest(){
        ArrayList<Integer> input = Reader.getInput();
        ArrayList<Integer> mine = compressDiskSpace(convertInputToDiskSpace(input));
        ArrayList<Integer> online = Day9OnlineSolution.getCompressedDisk(getDiskRepresentation(Reader.getInputLineAsString()));

        assertEquals(mine, online);
    }


}
