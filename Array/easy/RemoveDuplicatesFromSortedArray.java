
// input :  [1,2,2,3,4,4,5,6]

// [1, 2, 2, 3, 4, 4, 5, 6]
// [1, 2, 3, 3, 4, 4, 5, 6]
// [1, 2, 3, 4, 4, 4, 5, 6]
// [1, 2, 3, 4, 5, 4, 5, 6]
// [1, 2, 3, 4, 5, 6, 5, 6]

class Solution{
    public int removeDuplicate(int[] nums){
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i =0; i < nums.length; i++){
            if(nums[i]!=nums[j]) nums[++j] = nums[i];
        }
        return ++j;
    }
}