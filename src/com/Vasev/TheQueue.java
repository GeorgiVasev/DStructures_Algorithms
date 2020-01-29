package com.Vasev;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;

    private int front, numberOfItems, rear = 0;

    TheQueue(int size) {

        queueSize = size;

        queueArray = new String[size];

        // Assigns the value of -1 to every value in the array
        // so I can control what gets printed

        Arrays.fill(queueArray, "-1");

    }

    public void queue(String input) {

        if (numberOfItems + 1 <= queueSize) {

            queueArray[rear] = input;
            rear++;
            numberOfItems++;

            System.out.println("INSERT " + input + " Was added to the Queue\n");

        } else {

            System.out.println("Sorry the Queue is FULL!");

        }
    }

    public void dequeue() {

        if (numberOfItems > 0) {

            System.out.println("Remove " + queueArray[front] + " Was removed from the Queue\n");

            // Just like in memory an item isn't deleted, but instead is just not available

            queueArray[front] = "-1";
            front++;
            numberOfItems--;

        } else {

            System.out.println("Sorry the Queue is EMPTY");

        }

    }

    public void peek() {

        System.out.println("First element is " + queueArray[front]);

    }

    public void priorityQueue(String input) {

        int i;

        if (numberOfItems == 0) {

            queue(input);

        } else {

            for (i = numberOfItems - 1; i >= 0; i--) {

                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {

                    queueArray[i + 1] = queueArray[i];

                } else {

                    break;

                }

            }

            queueArray[i + 1] = input;
            rear++;
            numberOfItems++;

        }
    }

    public void displayQueue() {

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < queueSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < queueSize; n++) {

            if (queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s " + " ", queueArray[n]));

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        // Number of spaces to put before the F

        int spacesBeforeFront = 3 * (2 * (front + 1) - 1);

        for (int k = 1; k < spacesBeforeFront; k++) System.out.print(" ");

        System.out.print("F");

        // Number of spaces to put before the R

        int spacesBeforeRear = (2 * (3 * rear) - 1) - (spacesBeforeFront);

        for (int l = 0; l < spacesBeforeRear; l++) System.out.print(" ");

        System.out.print("R");

        System.out.println("\n");


    }
}
