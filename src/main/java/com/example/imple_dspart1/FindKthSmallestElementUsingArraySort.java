package com.example.imple_dspart1;
import java.util.Arrays;

public class FindKthSmallestElementUsingArraySort {
    public int findKthSmallestElement(int k, int [] array){
        Arrays.sort(array);
        return array[k-1];
    }
}
