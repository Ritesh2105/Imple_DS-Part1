package com.example.imple_dspart1;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        int find = 4;
        int [] array = new int[]{1,2,3,4,5,6};
        Integer [] arr = new Integer[]{1,2,3,4,5,6};
        ArrayLinearSearch als = new ArrayLinearSearch(); //Creating object of ArrayLinearSearch class
        System.out.println(als.findLinearSearch(find)); //Calling method findLinearSearch and passing the find as arguments

        ArrayBinarySearch abs = new ArrayBinarySearch();
        System.out.println(abs.arrayBinarySearch(find, array));

        SortingUsingArraysSort suas = new SortingUsingArraysSort();
        System.out.println(Arrays.toString(suas.sortingUsingArraysSort(array)));
        System.out.println(Arrays.toString(suas.DescSortingUsingArraysSort(arr)));

    }
}
