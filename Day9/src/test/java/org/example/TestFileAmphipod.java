package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFileAmphipod {

    @Test
    public void constructorTest () {

        FileAmphipod fileAmphipod = new FileAmphipod(1, 2);
        assertEquals(1, fileAmphipod.getSize());
        assertEquals(2, fileAmphipod.getId());
    }
}
