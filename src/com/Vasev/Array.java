package com.Vasev;

public class Array {

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

    public void printHorizArray(int i, int j) {

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        // ADD for BubbleSort

        if (j != -1) {

            for (int k = 0; k < ((j * 5) + 2); k++) System.out.print(" ");

            System.out.print(j);
        }

        // ADD this for other sorting algorithms.

        if (i != -1) {

            for (int l = 0; l < (5 * (i - j) - 1); l++) System.out.print(" ");

            System.out.print(i);

        }

        System.out.println();


    }


    public void bubbleSort() {

        for (int i = arraySize - 1; i > 1; i--) {

            for (int j = 0; j < i; j++) {

                if (theArray[j] > theArray[j + 1]) {

                    swapValues(j, j + 1);

                    printHorizArray(i, j);

                }

            }

        }

    }

    public void swapValues(int indexOne, int indexTwo) {

        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;

    }

    public void binarySearch(int value) {

        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while (highIndex >= lowIndex) {

            int midIndex = (highIndex + lowIndex) / 2;

            if (theArray[midIndex] < value) {
                lowIndex = midIndex + 1;
            } else if (theArray[midIndex] > value) {
                highIndex = midIndex - 1;
            } else {
                System.out.println("\nFound a match for " + value + " at index " + midIndex);

                lowIndex = highIndex + 1;
            }

            printHorizArray(midIndex, -1);

        }
    }

    public void selectionSort() {

        for (int x = 0; x < arraySize; x++) {
            int min = x;

            for (int y = x; y < arraySize; y++) {
                if (theArray[min] > theArray[y]) {
                    min = y;
                }
            }

            swapValues(x, min);

            printHorizArray(x, -1);
        }
    }

    public void insertionSort() {

        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = theArray[i];
            while ((j > 0) && (theArray[j - 1] > toInsert)) {
                theArray[j] = theArray[j - 1];
                j--;

                printHorizArray(i, j);

            }
            theArray[j] = toInsert;

            printHorizArray(i, j);

            System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");

        }

    }
}
