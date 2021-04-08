/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author troy
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];

            int i = 0;

            // because comparison is from right to left we will have to iterate backward
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) { //3,2,1

                arr[i] = arr[i - 1]; // shift the array 

            }

            arr[i] = newElement;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
