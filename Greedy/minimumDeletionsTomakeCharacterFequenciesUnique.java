package Greedy;

import java.util.HashMap;
import java.util.Map;

public class minimumDeletionsTomakeCharacterFequenciesUnique {

    public static void main(String[] args) {
        String s="aaabbbcc";
        System.out.println(minDeletions(s));
        
    }
    public static int minDeletions(String s) {
         Map<Character, Integer> charCountMap = new HashMap<>();
        
       
        for (int i = 0; i < s.length(); i++) {
            charCountMap.put(s.charAt(i), charCountMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        Map<Integer, Integer> freqCountMap = new HashMap<>();
        int deletions = 0;
        
      
        for (int count : charCountMap.values()) {
            while (count > 0 && freqCountMap.containsKey(count)) {
                count--;
                deletions++;
            }
            freqCountMap.put(count, freqCountMap.getOrDefault(count, 0) + 1);
        }
        
        return deletions;
    }
    
}
