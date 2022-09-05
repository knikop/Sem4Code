/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Stack;
import java.util.Scanner;

/**
 * The Method for the Implementation of the calculator
 * @author Kosta Nikopoulos
 */
public class RPNEval{

    public static int eval(String exp) {
        char[] tokens = exp.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') {
                continue;
            }
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                while (i < tokens.length
                        && tokens[i] >= '0'
                        && tokens[i] <= '9') {
                    sbuf.append(tokens[i++]);
                }
                values.push(Integer.parseInt(sbuf.toString()));
                i--;
            } else if (tokens[i] == '(') {
                ops.push(tokens[i]);
            } else if (tokens[i] == ')') {
                while (ops.peek() != '(') {
                    values.push(Calculate(ops.pop(),
                            values.pop(),
                            values.pop()));
                }
                ops.pop();
            } else if (tokens[i] == '+'
                    || tokens[i] == '-'
                    || tokens[i] == '*'
                    || tokens[i] == '/') {

                while (!ops.empty() && isPrecedent(tokens[i], ops.peek())) {
                    values.push(Calculate(ops.pop(), values.pop(), values.pop()));
                }

                ops.push(tokens[i]);
            }
        }

        while (!ops.empty()) {
            values.push(Calculate(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    //Method for if an operation has brackets
    public static boolean isPrecedent(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/')
                && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    //Method used to apply an operator and calculate the result of the operation
    public static int Calculate(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException(
                            "Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
   
}