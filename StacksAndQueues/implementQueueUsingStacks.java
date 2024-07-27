package StacksAndQueues;

import java.util.Stack;

class MyQueue {

    Stack<Integer> q=new Stack<Integer>();
 
     public MyQueue() {
       
     }
     
     public void push(int x) {
         Stack<Integer> temp=new Stack<Integer>();
         while(!q.empty()){
             temp.push(q.pop());
         }
         q.push(x);
         while(!temp.empty()){
             q.push(temp.pop());
         }
 
         
         
     }
     
     public int pop() {
         return q.pop();
         
     }
     
     public int peek() {
         return q.peek();
         
     }
     
     public boolean empty() {
         return q.empty();
         
     }
 }

public class implementQueueUsingStacks {

    public static void main(String[] args) {
        MyQueue obj=new MyQueue();
        obj.push(7);
        obj.push(3);
        obj.push(9);
        obj.push(5);
        int value1=obj.pop();
        System.out.println(value1);
        int value2=obj.pop();
        System.out.println(value2);
        boolean b1=obj.empty();
        System.out.println(b1);

    }
}