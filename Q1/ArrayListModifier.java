package com.maktab.HW6.Q1;

import java.util.ArrayList;

public class ArrayListModifier {

    public static ArrayList<Integer> removeInappropriate(ArrayList<Integer> arrList) {

        int cont = 0;//ArrayList counter

        if (arrList.size() % 2 != 0)
            arrList.remove(arrList.size() - 1);

        while (cont < arrList.size()) {

            if (arrList.get(cont) > arrList.get(cont + 1)) {
                arrList.remove(cont);
                arrList.remove(cont);
                cont += 2;
            } else
                cont += 2;
        }
        return arrList;

    }//end of method

}//end of ArrayListModifier

