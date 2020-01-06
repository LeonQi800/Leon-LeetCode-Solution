class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >=0; i--){
            digits[i] += carry;
            if (digits[i] <= 9)
                return digits;
            digits[i] = 0;
        }
        int[] newResult = new int[digits.length + 1];
        newResult[0] = 1;
        return newResult;
    }
}