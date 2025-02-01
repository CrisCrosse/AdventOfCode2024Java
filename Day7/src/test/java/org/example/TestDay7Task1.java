package org.example;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TestDay7Task1 {

    @Test
    public void isPossibleReturnsTrueSingleMultiplicationTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("190"));
        equation.add(new BigInteger("10"));
        equation.add(new BigInteger("19"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueSingleAdditionTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("29"));
        equation.add(new BigInteger("10"));
        equation.add(new BigInteger("19"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueTwoAdditionsTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("31"));
        equation.add(new BigInteger("10"));
        equation.add(new BigInteger("19"));
        equation.add(new BigInteger("2"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueTwoMultiplicationsTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("380"));
        equation.add(new BigInteger("10"));
        equation.add(new BigInteger("19"));
        equation.add(new BigInteger("2"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }


    @Test
    public void isPossibleReturnsTrueAdditionAndMultiplicationTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("3267"));
        equation.add(new BigInteger("81"));
        equation.add(new BigInteger("40"));
        equation.add(new BigInteger("27"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueThreeAdditionsTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("11"));
        equation.add(new BigInteger("3"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("4"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueThreeMultiplicationsTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("48"));
        equation.add(new BigInteger("3"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("4"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueTwoMultiplicationsAndAdditionTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("16"));
        equation.add(new BigInteger("3"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("4"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueTwoAdditionsAndMultiplicationTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("28"));
        equation.add(new BigInteger("3"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("4"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueAdditionMultiplicationAdditionTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("14"));
        equation.add(new BigInteger("3"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("4"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }


    @Test
    public void isPossibleReturnsTrueMultiplicationAdditionMultiplicationTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("32"));
        equation.add(new BigInteger("3"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("2"));
        equation.add(new BigInteger("4"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }





    @Test
    public void isPossibleReturnsFalseTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("83"));
        equation.add(new BigInteger("17"));
        equation.add(new BigInteger("5"));

        Boolean expected = false;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsFalseTestOther1() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("156"));
        equation.add(new BigInteger("15"));
        equation.add(new BigInteger("6"));

        Boolean expected = false;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsFalseTestOther2() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("7290"));
        equation.add(new BigInteger("6"));
        equation.add(new BigInteger("8"));
        equation.add(new BigInteger("6"));
        equation.add(new BigInteger("15"));

        Boolean expected = false;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

    @Test
    public void isPossibleReturnsTrueSolvedOneWayTest() {
        ArrayList<BigInteger> equation = new ArrayList<>();
        equation.add(new BigInteger("292"));
        equation.add(new BigInteger("11"));
        equation.add(new BigInteger("6"));
        equation.add(new BigInteger("16"));
        equation.add(new BigInteger("20"));

        Boolean expected = true;
        Boolean actual = Day7Task1.isPossible(equation);

        assertEquals(expected, actual);
    }

// Test cases to add
//161011: 16 10 13
//192: 17 8 14
//21037: 9 7 18 13


}
