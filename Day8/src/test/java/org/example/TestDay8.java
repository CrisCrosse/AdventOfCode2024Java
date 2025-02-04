package org.example;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestDay8 {

    @Test
    public void test() {
        String[] args = {"hi", "bye"};
        Day8.main(args);
    }

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

    @Test
    public void getAntiNodesForCharTestAsFromExample(){
        ArrayList<Position> antennaPositions = new ArrayList<>();
        Position position_A1 = new Position(5, 6);
        Position position_A2 = new Position(8, 8);
        Position position_A3 = new Position(9, 9);
        antennaPositions.add(position_A1);
        antennaPositions.add(position_A2);
        antennaPositions.add(position_A3);

        Set<Position> expectedAntiNodes = new HashSet<>();
        Position antiNode_A1A2 = new Position(2, 4);
        Position antiNode_A1A3 = new Position(1, 3);
        Position antiNode_A2A1 = new Position(11, 10);
        Position antiNode_A2A3 = new Position(7, 7);
        Position antiNode_A3A2 = new Position(10, 10);
        expectedAntiNodes.add(antiNode_A1A2);
        expectedAntiNodes.add(antiNode_A1A3);
        expectedAntiNodes.add(antiNode_A2A1);
        expectedAntiNodes.add(antiNode_A2A3);
        expectedAntiNodes.add(antiNode_A3A2);

        Set<Position> actual = Day8.getAntiNodesForChar(antennaPositions, 11);

        assertIterableEquals(expectedAntiNodes, actual);

    }

    @Test
    public void getAntiNodesForCharTestOsFromExample(){
        ArrayList<Position> antennaPositions = new ArrayList<>();
        Position position_O1 = new Position(1, 8);
        Position position_O2 = new Position(2, 5);
        Position position_O3 = new Position(3, 7);
        Position position_O4 = new Position(4, 4);

        antennaPositions.add(position_O1);
        antennaPositions.add(position_O2);
        antennaPositions.add(position_O3);
        antennaPositions.add(position_O4);

        Set<Position> expectedAntiNodes = new HashSet<>();
        Position antiNode_O1O2 = new Position(0, 11);
        Position antiNode_O2O1 = new Position(3, 2);
        Position antiNode_O2O3 = new Position(1, 3);
        Position antiNode_O2O4 = new Position(0, 6);
        Position antiNode_O3O1 = new Position(5, 6);
        Position antiNode_O3O2 = new Position(4, 9);
        Position antiNode_O3O4 = new Position(2, 10);
        Position antiNode_O4O1 = new Position(7, 0);
        Position antiNode_O4O2 = new Position(6, 3);
        Position antiNode_O4O3 = new Position(5, 1);
        expectedAntiNodes.add(antiNode_O1O2);
        expectedAntiNodes.add(antiNode_O2O1);
        expectedAntiNodes.add(antiNode_O2O3);
        expectedAntiNodes.add(antiNode_O2O4);
        expectedAntiNodes.add(antiNode_O3O1);
        expectedAntiNodes.add(antiNode_O3O2);
        expectedAntiNodes.add(antiNode_O3O4);
        expectedAntiNodes.add(antiNode_O4O1);
        expectedAntiNodes.add(antiNode_O4O2);
        expectedAntiNodes.add(antiNode_O4O3);

        Set<Position> actual = Day8.getAntiNodesForChar(antennaPositions, 11);

        assertIterableEquals(expectedAntiNodes, actual);

    }

    @Test
    public void getAntiNodesTest(){
        ArrayList<Position> antennaPositionsOs = new ArrayList<>();
        Position position_O1 = new Position(1, 8);
        Position position_O2 = new Position(2, 5);
        Position position_O3 = new Position(3, 7);
        Position position_O4 = new Position(4, 4);
        antennaPositionsOs.add(position_O1);
        antennaPositionsOs.add(position_O2);
        antennaPositionsOs.add(position_O3);
        antennaPositionsOs.add(position_O4);
        Position position_A1 = new Position(5, 6);
        Position position_A2 = new Position(8, 8);
        Position position_A3 = new Position(9, 9);
        ArrayList<Position> antennaPositionsAs = new ArrayList<>();
        antennaPositionsAs.add(position_A1);
        antennaPositionsAs.add(position_A2);
        antennaPositionsAs.add(position_A3);

        Map<Character, ArrayList<Position>> antennaPositionsByChar = new HashMap<>();
        antennaPositionsByChar.put('O', antennaPositionsOs);
        antennaPositionsByChar.put('A', antennaPositionsAs);

        Set<Position> expectedAntiNodes = new HashSet<>();
        Position antiNode_O1O2 = new Position(0, 11);
        Position antiNode_O2O1 = new Position(3, 2);
        Position antiNode_O2O3 = new Position(1, 3);
        Position antiNode_O2O4 = new Position(0, 6);
        Position antiNode_O3O1 = new Position(5, 6);
        Position antiNode_O3O2 = new Position(4, 9);
        Position antiNode_O3O4 = new Position(2, 10);
        Position antiNode_O4O1 = new Position(7, 0);
        Position antiNode_O4O2 = new Position(6, 3);
        Position antiNode_O4O3 = new Position(5, 1);
        expectedAntiNodes.add(antiNode_O1O2);
        expectedAntiNodes.add(antiNode_O2O1);
        expectedAntiNodes.add(antiNode_O2O3);
        expectedAntiNodes.add(antiNode_O2O4);
        expectedAntiNodes.add(antiNode_O3O1);
        expectedAntiNodes.add(antiNode_O3O2);
        expectedAntiNodes.add(antiNode_O3O4);
        expectedAntiNodes.add(antiNode_O4O1);
        expectedAntiNodes.add(antiNode_O4O2);
        expectedAntiNodes.add(antiNode_O4O3);
        Position antiNode_A1A2 = new Position(2, 4);
        Position antiNode_A1A3 = new Position(1, 3);
        Position antiNode_A2A1 = new Position(11, 10);
        Position antiNode_A2A3 = new Position(7, 7);
        Position antiNode_A3A2 = new Position(10, 10);
        expectedAntiNodes.add(antiNode_A1A2);
        expectedAntiNodes.add(antiNode_A1A3);
        expectedAntiNodes.add(antiNode_A2A1);
        expectedAntiNodes.add(antiNode_A2A3);
        expectedAntiNodes.add(antiNode_A3A2);

        Set<Position> actual = Day8.getAntiNodes(antennaPositionsByChar, 11);

        assertEquals(expectedAntiNodes, actual);

    }


    @Test
    public void getAntiNodesForCharWithHarmonicResonanceTestAsFromExample(){
        ArrayList<Position> antennaPositions = new ArrayList<>();
        Position position_A1 = new Position(5, 6);
        Position position_A2 = new Position(8, 8);
        Position position_A3 = new Position(9, 9);
        antennaPositions.add(position_A1);
        antennaPositions.add(position_A2);
        antennaPositions.add(position_A3);

        Set<Position> expectedAntiNodes = new HashSet<>();
//        original antinodes
        Position antiNode_A1A2 = new Position(2, 4);
        Position antiNode_A1A3 = new Position(1, 3);
        Position antiNode_A2A1 = new Position(11, 10);
        Position antiNode_A2A3 = new Position(7, 7);
        Position antiNode_A3A2 = new Position(10, 10);
        expectedAntiNodes.add(antiNode_A1A2);
        expectedAntiNodes.add(antiNode_A1A3);
        expectedAntiNodes.add(antiNode_A2A1);
        expectedAntiNodes.add(antiNode_A2A3);
        expectedAntiNodes.add(antiNode_A3A2);
//        original nodes are now antinodes
        expectedAntiNodes.add(position_A1);
        expectedAntiNodes.add(position_A2);
        expectedAntiNodes.add(position_A3);
//      new Antinodes - A2 --> A3 is 1/1 gradient
        Position antiNode_A2A3_1 = new Position(6, 6);
        Position antiNode_A2A3_2 = new Position(5, 5);
        Position antiNode_A2A3_3 = new Position(4, 4);
        Position antiNode_A2A3_4 = new Position(3, 3);
        Position antiNode_A2A3_5 = new Position(2, 2);
        Position antiNode_A2A3_6 = new Position(1, 1);
        Position antiNode_A2A3_7 = new Position(0, 0);
        Position antiNode_A3A2_1 = new Position(10, 10);
        Position antiNode_A3A2_2 = new Position(11, 11);
        expectedAntiNodes.add(antiNode_A2A3_1);
        expectedAntiNodes.add(antiNode_A2A3_2);
        expectedAntiNodes.add(antiNode_A2A3_3);
        expectedAntiNodes.add(antiNode_A2A3_4);
        expectedAntiNodes.add(antiNode_A2A3_5);
        expectedAntiNodes.add(antiNode_A2A3_6);
        expectedAntiNodes.add(antiNode_A2A3_7);
        expectedAntiNodes.add(antiNode_A3A2_1);
        expectedAntiNodes.add(antiNode_A3A2_2);

        Set<Position> actual = Day8.getAntiNodesForCharWithHarmonicResonance(antennaPositions, 11);
        assertEquals(expectedAntiNodes, actual);

    }

    @Test
    public void getAntiNodesForCharTestWithHarmonicResonanceOsFromExample(){
        ArrayList<Position> antennaPositions = new ArrayList<>();
        Position position_O1 = new Position(1, 8);
        Position position_O2 = new Position(2, 5);
        Position position_O3 = new Position(3, 7);
        Position position_O4 = new Position(4, 4);

        antennaPositions.add(position_O1);
        antennaPositions.add(position_O2);
        antennaPositions.add(position_O3);
        antennaPositions.add(position_O4);

        Set<Position> expectedAntiNodes = new HashSet<>();
        Position antiNode_O1O2 = new Position(0, 11);
        Position antiNode_O2O1 = new Position(3, 2);
        Position antiNode_O2O3 = new Position(1, 3);
        Position antiNode_O2O4 = new Position(0, 6);
        Position antiNode_O3O1 = new Position(5, 6);
        Position antiNode_O3O2 = new Position(4, 9);
        Position antiNode_O3O4 = new Position(2, 10);
        Position antiNode_O4O1 = new Position(7, 0);
        Position antiNode_O4O2 = new Position(6, 3);
        Position antiNode_O4O3 = new Position(5, 1);
        expectedAntiNodes.add(antiNode_O1O2);
        expectedAntiNodes.add(antiNode_O2O1);
        expectedAntiNodes.add(antiNode_O2O3);
        expectedAntiNodes.add(antiNode_O2O4);
        expectedAntiNodes.add(antiNode_O3O1);
        expectedAntiNodes.add(antiNode_O3O2);
        expectedAntiNodes.add(antiNode_O3O4);
        expectedAntiNodes.add(antiNode_O4O1);
        expectedAntiNodes.add(antiNode_O4O2);
        expectedAntiNodes.add(antiNode_O4O3);

        Set<Position> actual = Day8.getAntiNodesForChar(antennaPositions, 11);

        assertIterableEquals(expectedAntiNodes, actual);

    }

}
