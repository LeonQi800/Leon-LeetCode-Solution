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

     // wrong answer need method to caculate " "
     public int lengthOfLongestSubstring2(String s){
      int[] map = new int[128];
      Arrays.fill(map, 0);
      int res = 0, left = 0;
      int len = s.length();
      for (int i = 0; i < len; i++){
          left = Math.max(left, map[s.charAt(i)]);
          map[s.charAt(i)] = i;
          res = Math.max(res, i - left);
       }
       return res;
   }
     
}