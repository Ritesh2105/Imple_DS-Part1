package com.example.imple_dspart1;
import java.util.Arrays;

public class FindKthLargestElementUsingArraySort {
    public int findKthLargestElement(int k, int [] array){
        Arrays.sort(array);
        return array[array.length-k];
    }
}
