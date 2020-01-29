/*
    Array, linked list , trees, etc are best for data that represents real objects.
    Stacks & Queues are instead used to complete a task and are soon after discarded.

    Stack & Queues
    1. Allow only a single item to be added or removed at a time
    2. Stacks allow access to the last item (LIFO)
    3. Queue allow access to the first item (FIFO)

 */

package com.Vasev;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;

    // Empty Stack

    private int topOfStack = -1;

    TheStack(int size) {

        stackSize = size;

        stackArray = new String[size];

        // Assigns the value of -1 to every value in the array
        // so I can control what gets printed
        Arrays.fill(stackArray, "-1");

    }

    public void push(String input) {

        if (topOfStack + 1 < stackSize) {

            topOfStack++;

            stackArray[topOfStack] = input;
        } else {
            System.out.println("Sorry, Stack is FULL!");
        }

        displayTheStack();

        System.out.println("PUSH " + input + " Was Added to the Stack\n");

    }

    public String pop() {

        if (topOfStack >= 0) {

            displayTheStack();

            System.out.println("POP " + stackArray[topOfStack] + " Was removed from the Stack\n");

            // Assigns -1 so the value won't appear
            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];
        } else {

            displayTheStack();

            System.out.println("Sorry, Stack is empty");

            return "-1";

        }
    }

    public String peek() {

        displayTheStack();

        System.out.println("PEEK " + stackArray[topOfStack] + " is at the TOP of the STACK\n");

        return stackArray[topOfStack];

    }

    public void pushMany(String multipleValues) {

        String[] tempString = multipleValues.split(" ");

        for (int i = 0; i < tempString.length; i++) {

            push((tempString[i]));

        }

    }

    public void popAll() {

        for (int i = topOfStack; i >= 0; i--) {

            pop();

        }

    }

    public void popDisplayAll() {

        String theReverse = "";

        for (int i = topOfStack; i >= 0; i--) {

            theReverse += stackArray[i];

        }

        System.out.println("The Reverse " + theReverse);

        popAll();

    }

    public void displayTheStack() {

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            if (stackArray[n].equals("-1")) {
                System.out.print("|    ");
            } else {
                System.out.print(String.format("| %2s " + " ", stackArray[n]));
            }

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

    }
}





