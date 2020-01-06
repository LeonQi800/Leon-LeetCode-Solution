class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        if (nums != null){
            for (int i = 0; i < nums.length; i++){
                sum = sum < 0? nums[i] : (sum + nums[i]);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}



// public int maxSubArray(int[] nums) {
//     int maxSum = Integer.MIN_VALUE;
//     if (nums.length == 1){
//         maxSum = nums[0];
//     }
//     if (nums.length > 1){
//         int tempMax = nums[0];
//         for (int i = 1; i < nums.length; i++){
//             tempMax = Math.max(nums[i], tempMax + nums[i]);
//             maxSum = Math.max(maxSum, tempMax);
//         }
//     }
//     return maxSum;
// }