/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.*;

/**
 * Moving the 0s to the end of the list
 * @author Kosta Nikopoulos
 */
public class Q3 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        //Note that when Entering the list into the scanner, 
        //you must place any letter after the last value of the list 
        //for the program to run
        System.out.println("Enter the list : ");
        //Taking input into the list
        //until the user
        //enters any character other than an int 
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            nums.add(i);
        }

        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 0) {

                //Counting the number of zeros
                count++;
            }
        }

        while (count != 0) {
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) == 0) {
                    Collections.swap(nums, i, i + 1);
                }
            }
            count--;
        }
        for (int i = 0; i < nums.size(); i++) {

            //Printing the final list
            System.out.print(nums.get(i) + " ");

        }
    }
}
