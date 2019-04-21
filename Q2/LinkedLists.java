package com.maktab.HW6.Q2;

public class LinkedList {

    private static int number;
    Node first;

    class Node{
        Node next;
        Object data;
        Node(Object nodeData){
            data = nodeData;
        }
    }

    public boolean isEmpty(){
        if(this.number == 0)
            return true;
        return false;
    }
    public void addNode(Object data){
        if (number == 0) {
            Node node = new Node(data);
            this.first = node;
        }
        else {
            Node node = new Node(data);
        }
    }
    public boolean removeNode(Object data){


    }
    public boolean search(Object data){
        for (int i = 0; i < number ; i++) {

        }
    }

}
