package com.maktab.HW6.Q2;

public class LinkedLists {

    //LinkedLists variables:
    private static int number = 0;
    Node first;

    //Constructors:
    public LinkedLists(Object data) {
        addNode(data);
    }

    public LinkedLists() {

    }

    //Checks if the Linked List is empty:
    public boolean isEmpty() {
        if (this.number == 0)
            return true;
        return false;
    }

    //Adds one Node to the end of the Linked List:
    public void addNode(Object data) {
        if (number == 0) {
            Node node = new Node(data);
            this.first = node;
            number++;
        } else {
            Node temp = new Node();
            temp = first;
            Node node = new Node(data);
            number++;
            for (int i = 0; i < number - 2; i++) {
                temp = temp.next;
            }
            temp.setNext(node);
        }
    }

    //Removes one node by getting the index of it:
    public boolean removeNode(int index) {

        if (index > number) {
            System.out.println("The input index is invalid!!!");
            return false;
        }

        Node target = this.first;

        for (int i = 0; i < index - 1; i++) {
            target = target.next;
            if (target == null)
                break;
        }
        if (index < number - 2) {
            target.next.setData(null);
            target.setNext(target.next.next);
        }
        if (index == 0)

            number--;
        System.out.println("The node is deleted.");
        return true;
    }

    //Searches the linked list for a specific Object and returns its index:
    public int search(Object data) {
        Node start = this.first;
        int index = 0;
        while (data != start.getData()) {
            index++;
            start = start.getNext();
            if (start == null) {
                System.out.println("This data isn't in Linked List!!!");
                break;
            }
        }
        return index;
    }

    //Node as a inner class in LinkedLists class:
    static class Node {
        Node next;
        Object data;

        Node(Object nodeData) {
            data = nodeData;
        }

        Node() {

        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

    }//end of Node class
}//end of LinkedLists class
