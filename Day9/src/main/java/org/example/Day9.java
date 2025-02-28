/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.math.BigInteger;
import java.util.ArrayList;

public class Day9 {

    public static void main(String[] args) {
        ArrayList<Integer> input = Reader.getInput();
//        System.out.println(input);
        ArrayList<Integer> diskSpace = convertInputToDiskSpace(input);
//        System.out.println(diskSpace);
        ArrayList<Integer> compressedDisk = compressDiskSpace(diskSpace);
        System.out.println(compressedDisk);


        BigInteger task1Sum = calculateCheckSum(compressedDisk);
        System.out.println(task1Sum);

//        Task2 solution
//        ArrayList<Integer> compressedByWholeFileDisk = compressDiskByWholeFile(input);
//        BigInteger task2Sum = calculateCheckSum(compressedByWholeFileDisk);

    }

    public static BigInteger calculateCheckSum(ArrayList<Integer> input) {
        BigInteger count = BigInteger.ZERO;
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == -1) {
                continue;
            }
            count = count.add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(input.get(i))));
        }
        return count;
    }

    public static ArrayList<Integer> convertInputToDiskSpace(ArrayList<Integer> input) {
        ArrayList<Integer> diskSpace = new ArrayList<>();
        int fileID = 0;

        for (int index = 0; index < input.size(); index++) {
            int fileOrSpaceSize = input.get(index);
            if (index % 2 == 0) {
//           file object
                for (int i = 0; i < fileOrSpaceSize; i++) {
                    diskSpace.add(fileID);
                }
                fileID++;
            } else {
//          space
                for (int i = 0; i < fileOrSpaceSize; i++) {
                    diskSpace.add(-1);
                }
            }
        }
        return diskSpace;
    }

    public static ArrayList<Integer> compressDiskSpace(ArrayList<Integer> input) {
        ArrayList<Integer> compressedDiskSpace = new ArrayList<>(input.size());
        int indexOfLastFileToMoveToFront = input.size() - 1;

        for (int index = 0; index <= input.size() - 1; index++) {
            if (index > indexOfLastFileToMoveToFront) {
                break;
            }
            int fileID = input.get(index);
            if (fileID == -1) {
                indexOfLastFileToMoveToFront = findLastFileIDUpTo(input, indexOfLastFileToMoveToFront);
                if (indexOfLastFileToMoveToFront < index) {
                    break;
                }
                int fileToMoveToFront = input.get(indexOfLastFileToMoveToFront);

                compressedDiskSpace.add(fileToMoveToFront);
//                    have now dealt with the lastFileID so find up to previous value
                indexOfLastFileToMoveToFront--;

            } else {
                compressedDiskSpace.add(fileID);
            }
        }

        return compressedDiskSpace;
    }


    public static int findLastFileIDUpTo(ArrayList<Integer> input, int lastFileIDIndex) {
        for (int last_index = lastFileIDIndex; last_index >= 0; last_index--) {
            if (input.get(last_index) != -1)
                return last_index;
        }
        return lastFileIDIndex;
    }

    public static ArrayList<Object> compressDiskByWholeFile(ArrayList<Integer> input) {
        ArrayList<Object> filesAndSpaceSizes = new ArrayList<>();

        int fileID = 0;

        for (int index = 0; index < input.size(); index++) {
            if (index % 2 == 0) {
                // file object
                filesAndSpaceSizes.add(new FileAmphipod(input.get(index), fileID));
                fileID++;
            } else {
                // space
                filesAndSpaceSizes.add(input.get(index));
            }
        }

        for (int reverse_index = input.size() - 1; reverse_index >= 0; reverse_index--) {
            Object reverseFileOrSpace = filesAndSpaceSizes.get(reverse_index);
            if(reverseFileOrSpace instanceof FileAmphipod){
//                attempt to move into space on the left
                FileAmphipod file = (FileAmphipod) filesAndSpaceSizes.get(reverse_index);
                int fileSize = file.getSize();

                for (int index = 0; index < reverse_index; index++) {
                    Object fileOrSpace = filesAndSpaceSizes.get(index);
                    if(fileOrSpace instanceof Integer){
                        int space = (Integer) fileOrSpace;
                        if(space == fileSize){
                            filesAndSpaceSizes.remove(reverse_index);
                            filesAndSpaceSizes.remove(index);
                            filesAndSpaceSizes.add(index, file);
                            break;
                        } if (Math.abs(space) > fileSize) {
                            int newSpace = space - fileSize;
                            filesAndSpaceSizes.remove(reverse_index);
                            filesAndSpaceSizes.remove(index);
                            filesAndSpaceSizes.add(index, newSpace);
                            filesAndSpaceSizes.add(index, file);
                            break;
                        }
                    }
                }

            }
        }
        return filesAndSpaceSizes;
    }

    public static ArrayList<Integer> convertFilesAndSpacesToNumberRepresentation(ArrayList<Object> filesAndSpaces){
        ArrayList<Integer> diskSpace = new ArrayList<>();
        for (Object fileOrSpace : filesAndSpaces) {
            if(fileOrSpace instanceof FileAmphipod){
                FileAmphipod file = (FileAmphipod) fileOrSpace;
                int fileSize = file.getSize();
                for (int i = 0; i < fileSize; i++) {
                    diskSpace.add(file.getId());
                }
            } else {
                int space = (Integer) fileOrSpace;
                for (int i = 0; i < Math.abs(space); i++) {
                    diskSpace.add(-1);
                }
            }
        }
        return diskSpace;
    }
}