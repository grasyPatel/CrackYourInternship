package Strings;

public class reverseWordsinString {
    public static void main(String[] args) {
        String s="the sky in blue";
        System.out.println(reverseWords(s));
        

    }
    public static String reverseWords(String s) {
        String t=s.trim();
       String a[]=null;
       a=t.split(" ");
       StringBuilder sb=new StringBuilder();
       for(int i=a.length-1;i>=0;i--){
           if(!a[i].equals("")) {
               sb.append(a[i]);
               if(i>0){
                   sb.append(" ");
               }
           }

       }
       return sb.toString();
       
   }

    
}
