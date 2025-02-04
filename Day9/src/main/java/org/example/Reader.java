package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<String> getInputLine() {
        ArrayList<String> inputs = new ArrayList<>();
        try(Scanner scanner = new Scanner(
                new File(
                "/Users/chris.rossell/projects/AdventOfCode2024Java/Day9/src/main/resources/input.txt")
                ).useDelimiter("\n")
        ) {
            while (scanner.hasNextLine()) {
                inputs.add(scanner.next());
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(inputs);
        return inputs;
    }


}
