package com.example.imple_dspart1;

public class ArrayLinearSearch {
    int [] array = new int []{1,2,3,4,5,6,7};
    public boolean findLinearSearch(int find){
        for(int i=0;i<array.length;i++) {
            if (array[i] == find) return true;
        }
        return false;
    }
}
