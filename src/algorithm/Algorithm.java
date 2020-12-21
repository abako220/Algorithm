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
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] data = {2, 3, 5, 7, 8, 10, 12, 15, 18, 20};
        int target = 7;
        Arrays.sort(data);
        System.out.println("Array values: ");
        for (int d : data) {
            System.out.print(d + ",");
        }

        System.out.println();
        BinarySearch bs = new BinarySearch();
        //int result = bs.binarySearch(data, 0, data.length - 1, target);
        int result = bs.binarySearch(data, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}
