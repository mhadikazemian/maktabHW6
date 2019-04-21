package com.maktab.HW6.Q2;


public class Q2 {
    public static void main(String[] args) {

        //Creating a new Lined List & adding the first node:
        LinkedLists test = new LinkedLists("Ali");

        //Adding three more nodes:
        test.addNode("Ahmad");
        test.addNode("Akbar");
        test.addNode("Mohammad");

        //Testing isEmpty method:
        System.out.println("True if the list is empty/ false if it is not: " + test.isEmpty());

        //Testing removeNode method:
        test.removeNode(1);

        //Testing search method:
        test.search("Mohammad");

        //Printing the linked list nodes' data:
        LinkedLists.Node k = test.first;
        for (int i = 0; i < 3; i++) {
            System.out.println(k.getData());
            k = k.next;
        }
    }//end of main method
}//end of Q2 class
