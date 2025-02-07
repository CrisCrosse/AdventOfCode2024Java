package org.example;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Day9OnlineSolution {
    public static void main(String[] args) throws Exception {
//        List<String> lines = Util.readInput(false, 9, false);
        String input = Reader.getInputLineAsString();
        List<Integer> disk = getDiskRepresentation(input);

        for (int i = 0; i < disk.size(); i++) {
            if (disk.get(i) == -1) {
                int val = -1;
                while (val == -1) {
                    val = disk.remove(disk.size() - 1);
                }
                if (disk.size() <= i) {
                    disk.add(val);
                    break;
                }
                disk.remove(i);
                disk.add(i, val);
            }
        }

        // 6288338133779 - Low
        // 6288599492129

        BigInteger count = BigInteger.ZERO;
        for (int i = 0; i < disk.size(); i++) {
            count = count.add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(disk.get(i))));
        }

        System.out.println(count);
    }
    public static ArrayList<Integer> getDiskRepresentation(String input) {
        ArrayList<Integer> disk = new ArrayList<>();
        boolean space = false;
        int id = 0;
        for (String character : input.split("")) {
            int num = Integer.parseInt(character);
            if (space) {
                for (int i = 0; i < num; i++) disk.add(-1);
            } else {
                for (int i = 0; i < num; i++) disk.add(id);
                id++;
            }
            space = !space;
        }
        return disk;
    }

    public static ArrayList<Integer> getCompressedDisk(ArrayList<Integer> disk) {
        for (int i = 0; i < disk.size(); i++) {
            if (disk.get(i) == -1) {
                int val = -1;
                while (val == -1) {
                    val = disk.remove(disk.size() - 1);
                }
                if (disk.size() <= i) {
                    disk.add(val);
                    break;
                }
                disk.remove(i);
                disk.add(i, val);
            }
        }
        return disk;
    }
}