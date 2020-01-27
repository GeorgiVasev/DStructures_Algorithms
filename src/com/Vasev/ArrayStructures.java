package com.Vasev;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    // Fills the Array with RANDOM values.

    public void generateRandomArray() {

        // Generates Random number (1-19).

        for (int i = 0; i < arraySize; i++) {

            theArray[i] = (int) ((Math.random()) * 10) + 10;

        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {

            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");

            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {

        if (index < arraySize) return theArray[index];
        return 0;

    }

    public boolean doesArrayContainThisValue(int value) {

        boolean valueInArray = false;

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {

                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {

        if (index < arraySize) {

            for (int i = index; i < (arraySize - 1); i++) {

                theArray[i] = theArray[i + 1];

            }

            arraySize--;

        }

    }

    public void insertValue(int value) {

        if (arraySize < 50) {

            theArray[arraySize] = value;

            arraySize++;

        }

    }

    public String linearSearch(int value) {

        boolean valueInArray = false;
        String indexWithValue = "";

        System.out.print("Value was faund at: ");

        for (int i = 0; i < arraySize; i++) {

            if (theArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexWithValue += i + " ";
            }

        }

        if (!valueInArray) {

            indexWithValue = "None";
            System.out.print(indexWithValue);

        }
        System.out.println();
        return indexWithValue;
    }

    public static void main(String[] args) {


        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(5));
        System.out.println(newArray.doesArrayContainThisValue(12));
        newArray.deleteIndex(5);
        newArray.printArray();
        newArray.insertValue(55);
        newArray.printArray();
        newArray.linearSearch(17);
    }
}
