package Strings;

import java.util.Arrays;

public class longestCommonPrefix{
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(CommonPrefix(strs));
        
    }
    public static String CommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
        
    }
    
}