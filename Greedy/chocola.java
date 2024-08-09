package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class chocola {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine().trim());
        
        while (testCases!= 0) {
            scanner.nextLine(); 
            
            String[] dimensions = scanner.nextLine().trim().split(" ");
            int m = Integer.parseInt(dimensions[0]);
            int n = Integer.parseInt(dimensions[1]);
            
          
            int[] x = new int[m - 1];
            for (int i = 0; i < m - 1; i++) {
                x[i] = Integer.parseInt(scanner.nextLine().trim());
            }
            
         
            int[] y = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                y[i] = Integer.parseInt(scanner.nextLine().trim());
            }
            
         
            int result = minCostToBreakChocolate(x, y);
            System.out.println(result);
            
           
            if (testCases > 0) {
                System.out.println();
            }
        }
        scanner.close();
    }

    private static int minCostToBreakChocolate(int[] x, int[] y) {
       
        Arrays.sort(x);
        Arrays.sort(y);
        
    
        int m = x.length;
        int n = y.length;
        for(int i = 0; i < m / 2; i++) {
            int temp = x[i];
            x[i] = x[m - i - 1];
            x[m - i - 1] = temp;
        }
        for(int i = 0; i < n / 2; i++) {
            int temp = y[i];
            y[i] = y[n - i - 1];
            y[n - i - 1] = temp;
        }

        int horizontalCount = 1;
        int verticalCount = 1;
        int i = 0, j = 0;
        int totalCost = 0;

        while (i < m && j < n) {
            if (x[i] >= y[j]) {
                totalCost += x[i] * horizontalCount;
                verticalCount++;
                i++;
            } else {
                totalCost += y[j] * verticalCount;
                horizontalCount++;
                j++;
            }
        }

    
        while (i < m) {
            totalCost += x[i] * horizontalCount;
            i++;
        }
        while (j < n) {
            totalCost += y[j] * verticalCount;
            j++;
        }

        return totalCost;
    }
    
}
