package Strings;

import Arrays.chocolateDistribution;

public class longestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        int k=2;
        System.out.println(characterReplacement(s, k));
        
    }
    public static int characterReplacement(String s, int k) {
        int len = s.length();
        int[] count = new int[26];
        int start = 0, maxCount = 0, maxLength = 0;
        for (int end = 0; end < len; end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
       
    

        
    }
    
}
