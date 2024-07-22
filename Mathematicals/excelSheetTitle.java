public class excelSheetTitle {
    public static void main(String []args){
        int columnNumber =29;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.insert(0,(char)('A'+columnNumber%26));
            columnNumber=columnNumber/26;
        }
        return sb.toString();
        
    }
    
}
