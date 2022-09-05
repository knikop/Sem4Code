/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *Created class for Implementing Stack
 * @author Kosta Nikopoulos
 */
public class MyStack<E> {

    private ArrayList<E> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
    
    /**
    *Created class for Implementing Queue
    * @author Kosta Nikopoulos
    */
    public static class MyQueue<E> {

        private LinkedList<E> queue;

        public MyQueue() {
            queue = new LinkedList<E>();
        }

        public E first() {
            return queue.getFirst();
        }

        public void enqueue(E e) {
            queue.addLast(e);
        }

        public E dequeue() {
            return queue.removeFirst();
        }

        public int getSize() {
            return queue.size();
        }

        @Override
        public String toString() {
            return "Queue: " + queue.toString();
        }
    }

    //The Main
    public static void main(String[] args) {
        
        //Part1
        MyStack<String> opStack = new MyStack<>();
        MyQueue<String> oqQueue = new MyQueue<>();

        //Operator Stack and Output Queue
        System.out.println(" Part 1: ");

        oqQueue.enqueue("4");
        opStack.push("+");
        oqQueue.enqueue("18");
        opStack.push("/");
        opStack.push("(");
        oqQueue.enqueue("9");
        opStack.push("-");
        oqQueue.enqueue("3");
        opStack.pop();
        opStack.pop();
        oqQueue.enqueue("-");
        opStack.pop();
        opStack.pop();
        oqQueue.enqueue("/");
        oqQueue.enqueue("+");
        System.out.println(opStack);
        System.out.println(oqQueue);

        //Part2 
        MyQueue<String> oqQueue2 = new MyQueue<>();
        MyStack<String> EvalStack = new MyStack<>();

        //Output Queue and Evaluation Stack
        System.out.println("");
        System.out.println(" Part 2: ");

        oqQueue2.enqueue("4");
        opStack.push("+");
        oqQueue2.enqueue("18");
        opStack.push("/");
        opStack.push("(");
        oqQueue2.enqueue("9");
        opStack.push("-");
        oqQueue2.enqueue("3");
        opStack.pop();
        opStack.pop();
        oqQueue2.enqueue("-");
        opStack.pop();
        opStack.pop();
        oqQueue2.enqueue("/");
        oqQueue2.enqueue("+");

        System.out.println("");
        System.out.println(oqQueue2);
        //Dequeueing from queue and pushing to Stack
        oqQueue2.dequeue();
        EvalStack.push("4");
        oqQueue2.dequeue();
        EvalStack.push("18");
        oqQueue2.dequeue();
        oqQueue2.dequeue();
        EvalStack.push("9");
        oqQueue2.dequeue();
        EvalStack.push("3");
        oqQueue2.dequeue();
        oqQueue2.dequeue();
        EvalStack.pop();
        EvalStack.pop();
        EvalStack.pop();
        EvalStack.peek();
        EvalStack.push("3");
        EvalStack.pop();
        EvalStack.pop();
        EvalStack.push("7");
        System.out.println(oqQueue2);

        System.out.println(EvalStack);
    }
}
