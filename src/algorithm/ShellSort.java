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
public class ShellSort {

    public static void shellSort(int[] arr) {
        //{20, 35, -15, 7, 55, 1, -22};

        
        for (int gap = arr.length/2; gap > 0; gap/=2) {
            
            int newElement = arr[gap];
            int j = 0;
            for (j = gap; j >= 0 && arr[j - gap] > newElement; j--) {
                arr[j] = arr[j - gap];
            }
            
            arr[j] = newElement;
        }
        
        
    }
}
