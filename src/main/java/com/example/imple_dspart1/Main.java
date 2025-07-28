package com.example.imple_dspart1;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        int find = 4;
        int [] array = new int[]{1,2,3,4,5,6,7,8,9};
        Integer [] arr = new Integer[]{1,2,3,4,5,6,7};
        ArrayLinearSearch als = new ArrayLinearSearch(); //Creating object of ArrayLinearSearch class
        System.out.println(als.findLinearSearch(find)); //Calling method findLinearSearch and passing the find as arguments

        ArrayBinarySearch abs = new ArrayBinarySearch();
        System.out.println(abs.arrayBinarySearch(find, array));

        SortingUsingArraysSort suas = new SortingUsingArraysSort();
        System.out.println(Arrays.toString(suas.sortingUsingArraysSort(array)));
        System.out.println(Arrays.toString(suas.DescSortingUsingArraysSort(arr)));

        FindKthSmallestElementUsingArraySort fkseuas = new FindKthSmallestElementUsingArraySort();
        System.out.println(fkseuas.findKthSmallestElement(4,array));

        FindKthLargestElementUsingArraySort fkleuas = new FindKthLargestElementUsingArraySort();
        System.out.println(fkleuas.findKthLargestElement(3,array));

        FindKthSmallestElementUsingStreams fkseus = new FindKthSmallestElementUsingStreams();
        System.out.println(fkseus.findKthSmallestElement(4,array));
        System.out.println(fkseus.findKthLargestElement(3,array));

    }
}
