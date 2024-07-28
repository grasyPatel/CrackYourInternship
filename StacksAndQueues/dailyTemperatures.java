package StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperatures{
    public static void main(String[] args) {
        int temperatures[]={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperature(temperatures)));
        
    }
    public static int[] dailyTemperature(int[] temperatures) {
       Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                arr[idx] = i - idx;
            }
            stack.push(i);
        }    
         return arr; 
    }
    
}