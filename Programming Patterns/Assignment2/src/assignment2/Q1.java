/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Arrays;

/**
 * The square of each number sorted in non-decreasing order
 * @author Kosta Nikopoulos
 */
public class Q1 {

    public static void main(String[] args) {
        int nums[] = {-4, -1, 0, 3, 10};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
