import java.util.*;

public class LongestSubstring {

    static int solve(String str) {

        if(str.length()==0) 
             return 0;

        int maxans = Integer.MIN_VALUE; 

        for (int i = 0; i < str.length(); i++) { 

            Set<Character> se = new HashSet<>(); 

            for (int j = i; j < str.length(); j++) { 

                if (se.contains(str.charAt(j))) { 
                    maxans = Math.max(maxans, j - i); 
                    break; 
                }

                se.add(str.charAt(j)); 
            }
        }

        return maxans;
    }

    public static void main(String args[]) {
        String str = "abcdeacd";
        System.out.println("The longest substring without repeating characters is " + solve(str));
    }
}