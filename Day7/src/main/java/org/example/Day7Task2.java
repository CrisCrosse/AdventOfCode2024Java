package org.example;

import java.math.BigInteger;
import java.util.ArrayList;

public class Day7Task2 extends Day7Task1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<BigInteger>> input = Reader.getInput();
        System.out.println(input);

        BigInteger sum = BigInteger.ZERO;
        for(ArrayList<BigInteger> equation: input) {
            if(isPossible(equation))
                sum = sum.add(equation.get(0));
        }
        System.out.println(sum);
    }

    public static boolean isPossible(ArrayList<BigInteger> passedInEquation) {
        ArrayList<BigInteger> equation = new ArrayList<>(passedInEquation);
        BigInteger target  = equation.remove(0);

        ArrayList<BigInteger> ResultSet = getResultSet(equation);

        if(ResultSet.contains(target)) {
            return true;
        } else {
            return false;
        }
    }


    //    this function generates the result set of all possible + * operations on a set of integers
    public static ArrayList<BigInteger> getResultSet(ArrayList<BigInteger> equation) {
        int numberCount = equation.size();

        switch (numberCount) {
            case 0:
                return new ArrayList<>();
            case 1:
                return equation;
            default:
                return calculateResults(equation);

        }
    }

    public static ArrayList<BigInteger> calculateResults(ArrayList<BigInteger> passedInEquation) {
        ArrayList<BigInteger> ResultSet = new ArrayList<>();
        ResultSet.add(passedInEquation.get(0));

        ArrayList<BigInteger> equation = new ArrayList<>(passedInEquation);
        equation.remove(0);

        for(BigInteger operator: equation)
            ResultSet = doOperationsOnEveryElement(ResultSet, operator);
        return ResultSet;
    }


    public static ArrayList<BigInteger> doOperationsOnEveryElement(ArrayList<BigInteger> resultSet,
                                                                   BigInteger operator) {
        ArrayList<BigInteger> newResultSet = new ArrayList<>();

        for (BigInteger operand : resultSet) {
            newResultSet.add(operator.multiply(operand));
            newResultSet.add(operator.add(operand));
            newResultSet.add(concatenateTwoBigInts(operand, operator));
        }
        return newResultSet;
    }

    public static BigInteger concatenateTwoBigInts(BigInteger a, BigInteger b) {
        BigInteger productOf10 = findFactorOf10OfBigInt(b);
        return a.multiply(productOf10).add(b) ;
    }
    
    public static BigInteger findFactorOf10OfBigInt(BigInteger b) {
        for(int i = 1; i < 100; i++) {
            BigInteger factorOf10 = BigInteger.valueOf((long) Math.pow(10, i));
            if(b.mod(factorOf10).equals(b)) {
                return factorOf10;
            }
        }
        return BigInteger.ONE;
    }

}
