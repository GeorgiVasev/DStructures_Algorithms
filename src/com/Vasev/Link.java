package com.Vasev;

public class Link {

    // Set to public so no getters & setters are needed

    public String bookName;
    public int millionsSold;

    /*

    Reference to next link is set in LinkList,
    to hold the reference to the Link that was created before it.
    Set to null until is connected to other links

    */

    public Link next;

    public Link(String boookName, int millionsSold) {

        this.bookName = boookName;
        this.millionsSold = millionsSold;

    }

    public void display() {

        System.out.println(bookName + ": " + millionsSold + ",000,000 sold");

    }

    public  String toString() {

        return bookName;

    }

}
