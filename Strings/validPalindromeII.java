package Strings;

public class validPalindromeII {
    public static void main(String args[]){
        String s="abca";
        System.out.println(validPalindrome(s));

    }
    public static boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return helper(s,i+1,j) || helper(s ,i ,j-1);
            }
            j--;
            i++;
        }
        return true;
        
    }
    public static boolean helper(String s ,int i ,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
