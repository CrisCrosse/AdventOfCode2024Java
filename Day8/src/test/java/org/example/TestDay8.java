package org.example;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TestDay8 {
    @Test
    public void getCharPositionsOneLineTest(){
        ArrayList<char[]> input = new ArrayList<>();
        char[] line1 = {'.', '.', 'a', 'b'};
        input.add(line1);
        Position position_a = new Position(0, 2);
        Position position_b = new Position(0, 3);


        Set<Character> expectedKeys = Sets.newHashSet('a', 'b');
        ArrayList<Position> expectedPositions_a = new ArrayList<>();
        ArrayList<Position> expectedPositions_b = new ArrayList<>();
        expectedPositions_a.add(position_a);
        expectedPositions_b.add(position_b);


        Map<Character, ArrayList<Position>> actual = Day8.getCharPositions(input);
        assertInstanceOf(HashMap.class, actual);

        Set<Character> actualKeys = actual.keySet();
        assertIterableEquals(expectedKeys, actualKeys);

        ArrayList<Position> actualPositions_a =  actual.get('a');
        ArrayList<Position> actualPositions_b =  actual.get('b');
        assertIterableEquals(expectedPositions_a, actualPositions_a);
        assertIterableEquals(expectedPositions_b, actualPositions_b);

    }

    @Test
    public void getCharPositionsMultipleLineTest(){
        ArrayList<char[]> input = new ArrayList<>();
        char[] line1 = {'.', '.', 'a', 'b'};
        char[] line2 = {'.', 'a', 'b', 'a'};
        input.add(line1);
        input.add(line2);
        Position position_a1 = new Position(0, 2);
        Position position_a2 = new Position(1, 1);
        Position position_a3 = new Position(1, 3);
        Position position_b1 = new Position(0, 3);
        Position position_b2 = new Position(1, 2);


        Set<Character> expectedKeys = Sets.newHashSet('a', 'b');
        ArrayList<Position> expectedPositions_a = new ArrayList<>();
        ArrayList<Position> expectedPositions_b = new ArrayList<>();
        expectedPositions_a.add(position_a1);
        expectedPositions_a.add(position_a2);
        expectedPositions_a.add(position_a3);
        expectedPositions_b.add(position_b1);
        expectedPositions_b.add(position_b2);


        Map<Character, ArrayList<Position>> actual = Day8.getCharPositions(input);
        assertInstanceOf(HashMap.class, actual);

        Set<Character> actualKeys = actual.keySet();
        assertIterableEquals(expectedKeys, actualKeys);

        ArrayList<Position> actualPositions_a =  actual.get('a');
        ArrayList<Position> actualPositions_b =  actual.get('b');
        assertIterableEquals(expectedPositions_a, actualPositions_a);
        assertIterableEquals(expectedPositions_b, actualPositions_b);

    }

}
