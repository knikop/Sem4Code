/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Minimizing the total amount of operations
 * @author Kosta Nikopoulos
 */
public class Q4 {

    public static void main(String args[]) {

        List<Integer> nums = Arrays.asList(0, 1, 0, 3, 12);

        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        System.out.print("Originial list: " + nums);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 0) {
                continue;
            }
            arrayInt.add(nums.get(i));

        }

        System.out.println(" ");
        for (int i = arrayInt.size(); i < nums.size(); i++) {
            arrayInt.add(0);
        }

        System.out.print("Result list: ");

        for (int val : arrayInt) {
            System.out.print(val + " ");
        }

        System.out.println("");

    }
}
