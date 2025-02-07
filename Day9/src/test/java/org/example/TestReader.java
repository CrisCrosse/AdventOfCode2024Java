package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TestReader {
    @Test
    public void getInputAsStringAndConvertTest() {
        String inputString = Reader.getInputLineAsString();
        assert inputString != null;
        ArrayList<Integer> inputIntArray = Reader.convertInputToIntArray(inputString);
        assert inputIntArray.size() == 19999;

    }
    @Test
    public void getInputTest() {
        ArrayList<Integer> inputIntArray = Reader.getInput();
        assert inputIntArray.size() == 19999;

    }
}
