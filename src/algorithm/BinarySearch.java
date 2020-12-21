/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Arrays;

/**
 *
 * @author opaymacbookpro
 */
public class BinarySearch {

    // The idea of binary search is to use the information that the array is sorted 
    // and reduce the time complexity to O(Log n).
    // This method is a Recursive method.
    public int binarySearch(int[] data, int start, int end, int target) {

        if (end >= start) {

            int mid = start + (end - start) / 2;

            if (data[mid] == target) {
                return mid;
            }

            if (data[mid] > target) {
                return binarySearch(data, start, mid - 1, target);
            }

            return binarySearch(data, mid + 1, end, target);

        }

        return - 1;

    }

    /**
     * Binary search method using linear method
     *
     * @param data
     * @param target
     * @return integer
     */
    public int binarySearch(int[] data, int target) {

        int start = 0;

        int end = data.length - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            // Check if target is present at mid 
            if (data[mid] == target) {
                return mid;
            }

            // Check if middle is less than target 
            if (data[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }
            
        }

        return - 1;
    }

}
