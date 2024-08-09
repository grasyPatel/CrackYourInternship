package Greedy;

import java.util.Stack;

public class removeKDigits {
    public static void main(String[] args) {
        String s="1432219";
        int k=3;
        System.out.println(removeKdigits(s, k));
        
    }
    public static String removeKdigits(String num, int k) {
           int len = num.length();
        if(k == 0)  return num;
        if(k == len) return "0";
        
        Stack<Character> stack = new Stack<>();
        int index = 0;
        
        while(index < len){
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(index)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(index++));
        }
        while(k-- > 0) stack.pop();
        
        String smallest = "";
        while(!stack.isEmpty()) smallest = stack.pop() + smallest;
        
		// delete leading zeros
        while(smallest.length() > 1 && smallest.charAt(0) == '0')
            smallest = smallest.substring(1);
        
        return smallest;
        
    }
    
}
