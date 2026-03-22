import java.util.*;
class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1 );
            }

            map.put(ch, right);
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        } 
        return maxLength;
    }

    public static void main(String args[]) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}