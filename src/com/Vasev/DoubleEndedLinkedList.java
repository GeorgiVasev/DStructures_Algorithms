package com.Vasev;

public class DoubleEndedLinkedList {

    Neighbor firstLink;
    Neighbor lastLink;

    public void insertInFirstPosition(String homeOwnerName, int houseNumber) {

        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        if (isEmpty()) {

            lastLink = theNewLink;

        } else {

            theNewLink.next = firstLink;
            firstLink = theNewLink;

        }
    }

    public void insertInLastPosition(String homeOwnerName, int houseNumber) {

        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        // If empty put the new Neighbor in first position
        if (isEmpty()) {

            firstLink = theNewLink;

        } else {

            // Assign the last Neighbors next to the new Neighbor
            lastLink.next = theNewLink;
            theNewLink.previous = lastLink; // FOR DOUBLY LINKED LIST

        }

        lastLink = theNewLink;

    }

    public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {

        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        Neighbor currentNeighbor = firstLink;

        while (currentNeighbor.houseNumber != key) {

            currentNeighbor = currentNeighbor.next;
            if (currentNeighbor == null) {

                return false;
            }
        }

        // If the match was for the last Neighbor in the list

        if (currentNeighbor == lastLink) {

            // Assign the new Neighbor as the last link

            theNewLink.next = null;

            lastLink = theNewLink;

        } else {

                /*

                It didn't match for the last link.
                Take next from the Neighbor that was
                here previously and assign theNewLink to
                the previous Neighbor

                 */

            theNewLink.next = currentNeighbor.next;

            currentNeighbor.next.previous = theNewLink;

        }

        theNewLink.previous = currentNeighbor;
        currentNeighbor.next = theNewLink;
        return true;

    }


    //Returns true if the LinkList is empty
    public boolean isEmpty() {

        return (firstLink == null);

    }

    public void display() {

        Neighbor theLink = firstLink;

        while (theLink != null) {

            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;

            System.out.println();
        }
    }
}

    class Neighbor {

        public String homeOwnerName;
        public int houseNumber;

        public Neighbor next;
        public Neighbor previous;

        public Neighbor(String homeOwnerName, int houseNumber) {

            this.homeOwnerName = homeOwnerName;
            this.houseNumber = houseNumber;

        }

        public void display() {

            System.out.println(homeOwnerName + ": " + houseNumber + " Privet Drive");

        }

        public String toString() {

            return homeOwnerName;

        }

    }

    class NeighborIterator {

        Neighbor currentNeighbor;
        Neighbor previousNeighbor;

        DoubleEndedLinkedList theNeighbors;

        NeighborIterator(DoubleEndedLinkedList theNeighbors) {

            this.theNeighbors = theNeighbors;

            currentNeighbor = theNeighbors.firstLink;
            previousNeighbor = theNeighbors.lastLink;

        }

        public boolean hasNext() {

            if (currentNeighbor.next != null) {
                return true;
            }
            return false;
        }

        public Neighbor next() {

            if (hasNext()) {

                previousNeighbor = currentNeighbor;
                currentNeighbor = currentNeighbor.next;
                return currentNeighbor;

            }

            return null;
        }

        public void remove() {

            // If it is at the beginning of the list
            if (previousNeighbor == null) {

                theNeighbors.firstLink = currentNeighbor.next;

            } else {

                previousNeighbor.next = currentNeighbor.next;

                if (currentNeighbor.next == null) {

                    // Assign first link as the current link
                    currentNeighbor = theNeighbors.firstLink;
                    previousNeighbor = null;

                } else {

                    currentNeighbor = currentNeighbor.next;

                }
            }

        }

    }


