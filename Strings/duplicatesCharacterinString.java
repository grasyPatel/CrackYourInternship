package Strings;

import java.util.*;

public class duplicatesCharacterinString {

    public static void main(String[]args){
        String s="test string";
        printduplicate(s);
    }


    public static void printduplicate(String s){
        Map<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character, Integer> set:mp.entrySet()){
            int n=set.getValue();
            if(n>1){
                System.out.println(set.getKey()+" ,"+n+" Times");
            }
        }


    }
    
}
