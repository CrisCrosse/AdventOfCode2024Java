package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestReader {
    @Test
    public void getInputTest() {
        ArrayList<char[]> actual = Reader.getInput();

        assertNotNull("getInput should return something", actual);
        assertEquals(50, actual.size());
        int firstLineLength = actual.get(0).length;
        int lastLineLength = actual.get(49).length;
        assertEquals(50, firstLineLength);
        assertEquals(50, lastLineLength);

        char[] line24 = new String("...................n.W......a...t......D....d.....").toCharArray();
        char[] line40 = new String("..................................................").toCharArray();
        char[] actualLine24 = actual.get(23);
        char[] actualLine40 = actual.get(39);

        for (int i = 0; i < actualLine24.length; i++) {
            System.out.println("expected: " + line24[i]);
            System.out.println("actual: " + actualLine24[i]);
            assertEquals(line24[i], actualLine24[i]);
        }
        for (int i = 0; i < actualLine40.length; i++) {
            System.out.println("expected: " + line40[i]);
            System.out.println("actual: " + actualLine40[i]);
            assertEquals(line40[i], actualLine40[i]);
        }

    }
}
