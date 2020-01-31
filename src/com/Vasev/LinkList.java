package com.Vasev;

public class LinkList {

    // Reference to first link in list
    // The last Link added to the LinkedList

    public Link firstLink;

    LinkList() {

        // First Link always starts as null

        firstLink = null;

    }

    // Returns true if LinkList is empty

    public boolean isEmpty() {

        return (firstLink == null);

    }

    public void insertFirstLink(String book, int millionsSold) {

        Link newLink = new Link(book, millionsSold);

        // Connects the firstLink field to the new Link
        newLink.next = firstLink;

        firstLink = newLink;

    }

    public Link removeFirst() {

        Link linkReference = firstLink;

        if (!isEmpty()) {

            // Removes the Link from the List

            firstLink = firstLink.next;

        } else {

            System.out.println("Empty LinkedList");

        }

        return linkReference;

    }

    public void display() {
