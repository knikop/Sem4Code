/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sorting and Merging Integer lists 
 * @author Kosta Nikopoulos
 */
public class Q5 {

    public static void main(String[] args) {

        //First List of Integers 
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 0, 0, 0);
        int m = 3;

        //Second List of Integers
        List<Integer> nums2 = Arrays.asList(2, 5, 6);
        int n = 3;

        for (int i = 0; i < n; i++) {
            nums1.set(m + i, nums2.get(i));
        }

        //Sort the list
        Collections.sort(nums1);

        //Print the list
        System.out.println(nums1);
    }
}
