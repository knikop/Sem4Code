/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 * The square of each number sorted in non-decreasing order 
 * DIFFERENT APPROACH
 * @author Kosta Nikopoulos
 */
public class Q2 {

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        int[] result = new int[arr.length];
        int p = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < 0) {
                j++;
            }
            arr[k] = arr[k] * arr[k];
        }
        i = j - 1;
        while (i >= 0 && j <= arr.length - 1) {
            if (arr[i] < arr[j]) {
                result[p] = arr[i];
                i--;
            } else {
                result[p] = arr[j];
                j++;
            }
            p++;
        }
        while (i >= 0) {
            result[p] = arr[i];
            i--;
            p++;
        }
        while (j <= arr.length - 1) {
            result[p] = arr[j];
            j++;
            p++;
        }
        for (i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
