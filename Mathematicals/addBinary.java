
public class addBinary{
    public static void main(String []args){
        String a="111";
        String b="001";
        System.out.println(addBinary(a, b));
     

    }
    public  static String addBinary(String a, String b) {
    
        StringBuilder sb= new StringBuilder();
        int m=a.length()-1;
        int n=b.length()-1;
        int sum=0;
        int carry=0;
        while(m>=0 || n>=0){
            int m1=0;
            int n1=0;
            if(m>=0){
                if(a.charAt(m)=='1'){
                    m1=1;
                }
                else{
                    m1=0;
                }

            }
            if(n>=0){
                if(b.charAt(n)=='1'){
                    n1=1;
                }
                else{
                    n1=0;
                }

            }
            sum=m1+n1+carry;
            if(sum==2){
                carry=1;
                sb.append('0');

            }
            else if(sum==3){
                carry=1;
                sb.append('1');
            }
            else if(sum==1){
                sb.append('1');
                carry=0;
            }
            else{
                sb.append('0');
                carry=0;
            }
            m--;
            n--;
        }
        if(carry==1){
            sb.append('1');
        }
        return sb.reverse().toString();
        
    }

}