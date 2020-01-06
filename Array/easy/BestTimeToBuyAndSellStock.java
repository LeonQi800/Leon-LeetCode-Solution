
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length < 1){
            return result;
        }
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > buy){
                result = Math.max(result, prices[i] - buy);
            }else{
                buy = prices[i];
            }
        }
        return result;
    }
    }