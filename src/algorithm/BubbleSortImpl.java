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
public class BubbleSortImpl {

    public static void swap(int[] arr, int i, int j) {
        /**
         * check to see if two numbers are the same, so we don't have to swap
         * e.g 2,2...no need to swap because they're both the same value
         *
         */

        if (i == j) {
            return;
        }

        int tempValue = arr[i];
        arr[i] = arr[j];
        arr[j] = tempValue;
        
    }

    public static void bubbleSort(int[] arr) {
        //int[] arr1 = {4, -7, 3, 2, -1, 9, 5, 6};

        /**
         * Our sorting is from Right - Left That means the last index of our
         * array has to decrease. The highest value in the array will be occupy
         * the last index sequentially
         */
        if (arr.length > 1) {
            for (int lastIndexOfArray = arr.length - 1; lastIndexOfArray >= 0; lastIndexOfArray--) {
                
                for(int i=0; i<lastIndexOfArray; i++){
                    if(arr[i] > arr[i+1]){
                       swap(arr,i, i+1);
                   }
                   
                        
                }
            }
            
            //Let's print the array values
            
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
           }
            
            // Quadratic time complexity n*n = n(2)
        }
        
        
        return;
    }

}
