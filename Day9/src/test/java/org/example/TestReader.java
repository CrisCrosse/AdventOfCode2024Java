package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TestReader {
    @Test
    public void getInputTest() {
        String inputString = Reader.getInputLineAsString();
        ArrayList<Integer> inputIntArray = Reader.convertInputToIntArray(inputString);

        assert inputIntArray.size() == 19999;

    }
}
