package com.Vasev;

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
    }
}
