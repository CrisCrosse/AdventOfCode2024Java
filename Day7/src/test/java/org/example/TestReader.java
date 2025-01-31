package org.example;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestReader {
    @Test
    public void getInputTest() {
        ArrayList<ArrayList<BigInteger>> actual = Reader.getInput();
        assertNotNull("getInput should return something", actual);
        assertEquals(850, actual.size());
        int first_equation_length = actual.get(0).size();
        int last_equation_length = actual.get(849).size();
        assertEquals(6, first_equation_length);
        assertEquals(7, last_equation_length);
    }
}
