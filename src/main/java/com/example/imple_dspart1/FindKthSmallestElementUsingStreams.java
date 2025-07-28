package com.example.imple_dspart1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

public class FindKthSmallestElementUsingStreams {
    public int findKthSmallestElement(int k,int [] array) {
        int kthSmallest = Arrays.stream(array)
                .sorted()
                .skip(k-1)
                .findFirst().orElse(-1);
        return kthSmallest;
    }

        public int findKthLargestElement(int k,int [] array) {
        int kthLargest = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .findFirst().orElse(-1);
        return kthLargest;

    }
}
