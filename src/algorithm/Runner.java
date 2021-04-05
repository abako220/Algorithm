/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import algorithm.BubbleSortImpl;

/**
 *
 * @author troy
 */
public class Runner {
    
    
    public static void main(String [] args) {
        int[] arr = {4, -7, 3, 2, -1, 9, 5, 6};
       BubbleSortImpl.bubbleSort(arr);
    } 
}
