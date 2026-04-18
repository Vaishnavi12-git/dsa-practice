import java.util.*;
class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else {
                set.add(s.charAt(right));
                right++;
            }

            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }


    public static void main(String args[]) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}