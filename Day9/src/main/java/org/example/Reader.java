package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<Integer> getInput() {
        String inputString = Reader.getInputLineAsString();
        return Reader.convertInputToIntArray(inputString);
    }

    public static String getInputLineAsString() {
        try(Scanner scanner = new Scanner(
                new File(
                "/Users/chris.rossell/projects/AdventOfCode2024Java/Day9/src/main/resources/input.txt")
                ).useDelimiter("\n")
        ) {
            return scanner.next();
            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ArrayList<Integer> convertInputToIntArray(String inputLine) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] splitInput = inputLine.split("");
        for (String s : splitInput) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }


}
