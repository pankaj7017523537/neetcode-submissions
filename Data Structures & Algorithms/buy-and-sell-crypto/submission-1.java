class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i]-minPrice;
            if(profit>maxProfit){
                maxProfit = profit;
            }

        }
        return maxProfit;
    }
}
