/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *Token Class
 * @author Kosta Nikopoulos
 */
public class Tokenize {

    public static String[] toakenize(String s) {
        String[] tokens = new String[s.length()];
        String op = "-/+*()";
        String number = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            if (op.contains(String.valueOf(s.charAt(i)))) {
                if (number.length() > 0) {
                    tokens[index] = number;
                    number = "";
                    index++;
                }
                tokens[index] = String.valueOf(s.charAt(i));
                index++;
            } else {
                number += String.valueOf(s.charAt(i));
            }
        }

        if (number.length() > 0) {
            tokens[index] = number;
            index++;
        }
        return tokens;
    }
}