package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<char[]> getInput(){
        ArrayList<String> inputLines = Reader.getInputLinesAsString();
        return Reader.convertInputLinesToCharArrays(inputLines);
    }

    public static ArrayList<String> getInputLinesAsString() {
        ArrayList<String> inputs = new ArrayList<>();
        try(Scanner scanner = new Scanner(
                new File(
                "/Users/chris.rossell/projects/AdventOfCode2024Java/Day8/src/main/resources/input.txt")
                ).useDelimiter("\n")
        ) {
            while (scanner.hasNextLine()) {
                inputs.add(scanner.next());
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputs;
    }

    public static ArrayList<char[]> convertInputLinesToCharArrays(ArrayList<String> inputs) {
        ArrayList<char[]> output = new ArrayList<>();
        for(String input: inputs) {
            char[] charArray = input.toCharArray();
            output.add(charArray);
        }
        return output;

    }

}
