package Strings;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
          List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);

        
    }
}
