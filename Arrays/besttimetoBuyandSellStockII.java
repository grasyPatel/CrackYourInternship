package Arrays;
public class besttimetoBuyandSellStockII{
    public static void main(String []args){
        int []prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                max=max-prices[i]+prices[i+1];
            }
        }
        return max;
       

        
    }
}