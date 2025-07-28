package com.example.imple_dspart1;

public class ArrayBinarySearch {
    public boolean arrayBinarySearch(int find, int [] array){
        int low = array[0];
        int high = array.length;
        int mid;

        while(low<=high) { //if low becomes greater than high then it will cause index out of bound exception as array's length is equal to high
            mid = low + (high - low) / 2; // to prevent index overflow
            if (mid == find) {
                return true;
            } else if (mid > find) {
                //low=low;
                high = mid - 1;
            } else {
                low = mid + 1;
                //high = high;
            }
        }
        return false;
    }
}
