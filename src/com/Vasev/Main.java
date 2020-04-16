package com.Vasev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Array newArray = new Array();

        newArray.generateRandomArray();

        /*

        newArray.printHorizArray(-1, -1);
        newArray.bubbleSort();
        newArray.selectionSort();
        newArray.insertionSort();
        newArray.binarySearch(15);

        */

        TheStack theStack = new TheStack(10);

        /*

        theStack.push("10");
        theStack.push("17");
        theStack.push("13");
        theStack.peek();
        theStack.pop();
        theStack.pop();
        theStack.pushMany(" R A B E");
        theStack.popDisplayAll();
        theStack.displayTheStack();

        */

        TheQueue theQueue = new TheQueue(10);

        /*

        theQueue.displayQueue();
        theQueue.queue("10");
        theQueue.queue("13");
        theQueue.queue("14");
        theQueue.queue("11");

        theQueue.dequeue();
        theQueue.displayQueue();

        theQueue.priorityQueue("11");
        theQueue.priorityQueue("14");
        theQueue.priorityQueue("12");

        theQueue.displayQueue();

        */

        LinkList theLinkList = new LinkList();

        /*

        theLinkList.insertFirstLink("Just Java", 100);
        theLinkList.insertFirstLink("A Tale of Forgoten Souls", 150);
        theLinkList.insertFirstLink("LOTR",200);
        theLinkList.insertFirstLink("Harry Potter",110);

        theLinkList.display();

        System.out.println("Value of first in LinkedList " + theLinkList.firstLink + "\n");

        theLinkList.find("LOTR");


        theLinkList.removeLink("LOTR");
        theLinkList.display();

        */

        DoubleEndedLinkedList doubleLinkList = new DoubleEndedLinkedList();

        /*

        doubleLinkList.insertInFirstPosition("George Todosev",4);
        doubleLinkList.insertInFirstPosition("Maria Todoseva",2);
        doubleLinkList.insertInFirstPosition("Rosen Vasilev",1);
        doubleLinkList.insertInFirstPosition("Emil Kostadinov",5);

        doubleLinkList.display();

        */

        /* HashFunction

        HashFunction theFunc = new HashFunction(30);

        // Simplest Hash Function

        // String[] elementsToAdd = { "1", "5", "17", "21", "26" };

        // theFunc.hashFunction1(elementsToAdd, theFunc.theArray);

        // Mod Hash Function
        // This contains exactly 30 items to show how collisions
        // will work

        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };

        theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

        // Locate the value 660 in the Hash Table

        theFunc.findKey("660");

        theFunc.displayTheStack();

        */

        /* HashFunction2 theFunc = new HashFunction2(31);

        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };

        // Demonstrate how data normally follows patterns and how
        // a non-prime sized array can cause havoc

        String[] elementsToAdd3 = { "30", "60", "90", "120", "150", "180",
                "210", "240", "270", "300", "330", "360", "390", "420", "450",
                "480", "510", "540", "570", "600", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };

        theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

        // theFunc.modThirty();

        theFunc.increaseArraySize(60);

        theFunc.displayTheStack();

        theFunc.fillArrayWithNeg1();

        theFunc.doubleHashFunc(elementsToAdd2, theFunc.theArray);

        theFunc.displayTheStack();

        theFunc.findKeyDblHashed("990");

        */

        Scanner input = new Scanner(System.in);

        // Make a 11 item array that will hold words
        // and definitions

        HashFunction3 wordHashTable = new HashFunction3(11);

        String wordLookUp = "a";

        // Keep retrieve requests until x is entered

        while (!wordLookUp.equalsIgnoreCase("x")) {

            System.out.println(": ");

            wordLookUp = input.nextLine();

            // Look for the word requested and print
            // it out to screen

            System.out.println(wordHashTable.find(wordLookUp));

        }

        // Display every item in the array with
        // the index they are associated with

        wordHashTable.displayTheArray();


        //Sorting Algorithms


        /*
        int [] array = new int[7];

        for (int i = 0; i < array.length; i ++) {
            array[i] = (int) (Math.random()*10);
        }
        System.out.println("Array before sorting:");
        for (int i : array){
            System.out.print(i + " ");
        }

        // SortAlgorithms.bubbleSort(array);
        // SortAlgorithms.selectionSort(array);
        // SortAlgorithms.insertionSort(array);
        // SortAlgorithms.shellSort(array,array.length);
        // SortAlgorithms.mergeSort(array,0,array.length-1);
           SortAlgorithms.quickSort(array,0,array.length-1);

        System.out.println("\nArray after sorting:");
        for (int i : array){
            System.out.print(i + " ");
        }
        int indexToFind = 5;
        System.out.println();
        if(SortAlgorithms.linearSearch(array,indexToFind) != -1) {
            System.out.println("Index found at: " + SortAlgorithms.linearSearch(array,indexToFind));
        } else {
            System.out.println("Index not found!");
        }
        int beg = 0;
        int end = array.length-1;
        int location = SortAlgorithms.binarySearch(array,beg,end,indexToFind);

        if(location != -1) {
            System.out.println("Index found at: " + location);
        } else {
            System.out.println("Index not found!");
        }

        */
    }
}
