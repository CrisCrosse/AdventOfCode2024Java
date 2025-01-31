package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<ArrayList<BigInteger>> getInput() {
        ArrayList<String> StringInputs = Reader.getInputAsString();
        return Reader.getInputAsInts(StringInputs);
    }
    public static ArrayList<String> getInputAsString() {
        ArrayList<String> inputs = new ArrayList<>();
        try(Scanner scanner = new Scanner(
                new File(
                "/Users/chris.rossell/projects/AdventOfCode2024Java/Day7/src/main/resources/input.txt")
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

    public static ArrayList<ArrayList<BigInteger>> getInputAsInts(ArrayList<String> StringInputs) {
        ArrayList<ArrayList<BigInteger>> inputs = new ArrayList<>();

        for(String s : StringInputs) {
            String[] line = s.split(" ");
            ArrayList<BigInteger> input = new ArrayList<>();
            for (String value: line) {
                value = value.replace(":", "");
                input.add(new BigInteger(value));
            }
            inputs.add(input);
        }
        return inputs;
    }
}
