package main;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int nm = nums1.length + nums2.length;

        int i = 0;
        int n = 0;
        int m = 0;

        while (i < nm) {
            // If finished iterating through nums1, finish filling with nums2
            if(n >= nums1.length) {
                merged[i] = nums2[m];
                m++;
                i++;
            }
            // If finished iterating through nums2, finish filling with nums1
            else if (m >= nums2.length) {
                merged[i] = nums1[n];
                n++;
                i++;
            } else {
                if(nums1[n] < nums2[m]) {
                    merged[i] = nums1[n];
                    n++;
                } else {
                    merged[i] = nums2[m];
                    m++;
                }
                i++;
            }
        }

        if(merged.length % 2 == 0) {
            int top = nm / 2;
            int bot = (nm / 2) - 1;

            return (merged[top] + merged[bot]) / 2.0;
        } else {
            return merged[nm / 2];
        }

    }
}
