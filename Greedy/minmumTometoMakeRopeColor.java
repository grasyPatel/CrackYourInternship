package Greedy;

public class minmumTometoMakeRopeColor {
    public static void main(String[] args) {
        String colors="abaac";
        int needTime[]={1,2,3,4,5};
        System.out.println(minCost(colors, needTime));
    }
    public static int minCost(String colors, int[] neededTime) {
        char color[] = colors.toCharArray();
        int sz = color.length, totalRemovalTime = 0, prevSafeColorIndx = 0;
       for(int indx = 1; indx < sz; indx++){
           char currColor = color[indx], prevSafeColor = color[prevSafeColorIndx];
         
           if(currColor == prevSafeColor){
               if(neededTime[indx] > neededTime[prevSafeColorIndx]){
                   totalRemovalTime += neededTime[prevSafeColorIndx];
                   prevSafeColorIndx = indx;
               }else{
                   totalRemovalTime += neededTime[indx];
               }
           }else prevSafeColorIndx = indx; 
       }
       return totalRemovalTime;
    }   
    
}
