class Solution {
    // Sliding Window
     public int lengthOfLongestSubstring(String s){
        int[] map = new int[128];
        char[] str = s.toCharArray();
        int max = 0, start = 0;
        int len = s.length();
        for (int end = 0; end < len; end++){
            if (map[str[end]] > 0){
               start = Math.max(start, map[str[end]]);
            }
            map[str[end]] = end + 1;
            max = Math.max(max, end - start + 1);
         }
         return max;
     }
     // DP
}