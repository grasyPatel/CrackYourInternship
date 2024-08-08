package Greedy;

public class taskScheduler {
    public static void main(String[] args) {
        char []tasks={'A','A','A','B','B','B'};
        int n=2;
        System.out.println(leastInterval(tasks, n));
        
    }
    public static int leastInterval(char[] tasks, int n) {
        int[] counter = new int[26];
        int max = 0;
        int maxCount = 0;
        for(char task : tasks) {
            counter[task - 'A']++;
            if(max == counter[task - 'A']) {
                maxCount++;
            }
            else if(max < counter[task - 'A']) {
                max = counter[task - 'A'];
                maxCount = 1;
            }
        }
        int count=max-1;
        int l=n-(maxCount-1);
        int s=count*l;
        int t=tasks.length-max*maxCount;
        int f=Math.max(0,s-t);
        return tasks.length+f;

        
    }
    
}
