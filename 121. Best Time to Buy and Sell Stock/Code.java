class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1) return 0;
        int min = prices[0];
        int max = prices[1];
        int diff = prices[1]-prices[0];
        for(int i=1;i<n;i++){
            diff=Math.max(diff,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        if(diff<0) return 0;
        return diff;
    }
}