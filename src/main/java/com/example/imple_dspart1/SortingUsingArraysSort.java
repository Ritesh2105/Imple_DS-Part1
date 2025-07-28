package com.example.imple_dspart1;
import java.util.Arrays;
import java.util.Collections;


public class SortingUsingArraysSort {
    public int[] sortingUsingArraysSort(int[] array){
        Arrays.sort(array);
        return array;
    }
    public Integer[] DescSortingUsingArraysSort(Integer [] array) {
        Arrays.sort(array, Collections.reverseOrder()); //Here array should be object of Integer class and not int primitive data type
        return array;
    }
}
