/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Scanner;
import static part1.RPNEval.eval;
import static part1.Tokenize.toakenize;


/**
 *Driver Class for the Reverse Polish Notation Calculator
 * @author Kosta Nikopoulos
 */
public class RPNDriver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Input a calculation
        System.out.print("Input: ");
        String exp = scan.nextLine();
        int res = eval(exp);
        //The output to previously input calculation
        System.out.println("Ouput: "+res);
        
        System.out.println();
       
//        String[] t = toakenize("4+18/(9-3)");
//        for(String s: t) { 
//            if (s!=null) {
//                System.out.println(s);
//            }
//        }
    }
}
