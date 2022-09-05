/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Arrays;
import java.util.List;

/**
 * Sorting and Merging Integer lists 
 * DIFFERENT APPROACH
 * @author Kosta Nikopoulos
 */
public class Q6 {

    public static void selectionSort(List<Integer> array) {
        //loop through the list from 0 to last
        for (int i = 0; i < array.size(); i++) {
            //First value is the smallest element
            int minIndex = i;
            //loop through i+1 to last
            for (int j = i + 1; j < array.size(); j++) {
                //if any one of the numbers in the list
                //is smaller then our considered number
                if (array.get(j) < array.get(minIndex)) {
                    //then assign min index to that number
                    minIndex = j;
                }
            }
            int temp = array.get(minIndex);
            //at the end swap value of index i with minIndex
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 0, 0, 0);
        int m = 3;

        List<Integer> nums2 = Arrays.asList(2, 5, 6);
        int n = 3;

        int count = 0;

        //merge both list together
        for (int i = m; i < nums1.size(); i++) {
            nums1.set(i, nums2.get(count));
            count++;
        }

        //Sort the list and then print
        selectionSort(nums1);
        System.out.println(nums1);
    }
}
