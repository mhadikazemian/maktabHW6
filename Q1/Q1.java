package com.maktab.HW6.Q1;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
    public static void main(String[] args) {

        //Creating new ArrayList:
        ArrayList<Integer> k = new ArrayList<Integer>();

        //Inserting elements into arrayList:
        Collections.addAll(k, 25, 3, 4, 57, 68, 9778, 957, 57);

        //Implementing static method from ArrayListModifier class
        ArrayListModifier.removeInappropriate(k);

        System.out.println(k);

    }//end of main method

}//end of Q1 class
