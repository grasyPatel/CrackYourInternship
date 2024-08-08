package Greedy;
public class gasStation {

    public static void main(String[] args) {
        int []gas={1,2,3,4,5};
        int []cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
        
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        for (int c : cost) {
            sumCost += c;
        }
        int sumGas = 0;
        for (int g : gas) {
            sumGas += g;
        }
        
        if (sumCost > sumGas) {
            return -1;
        }

        int currentGas = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                startingIndex = i + 1;
            }
        }
        return startingIndex;
        
    }
}