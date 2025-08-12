package com.example.imple_dspart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ImplArrayList {
    private ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4,1,2,3,4,1,2,3));
    private ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
   public ArrayList<Integer> removeDuplicates() {
       ArrayList<Integer> result = new ArrayList<>();

       for (Integer num : list2) {
           if (!result.contains(num)) {
               result.add(num);
           }
       }
       return result;
   }
   public void intersectionOfTwoList(){
       ArrayList<Integer> result = new ArrayList<>(list1);
       result.retainAll(list2);
   }
   public void reverseArrayList(){
       Collections.reverse(list1);
   }

}
