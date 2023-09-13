class BuyStockSellStock {
    public static void main (String[] args) {
        int[] prices={3,2,6,5,0,3};
        int profit=0;
        int max=0;
        int buy=0;
        for(int i=1;i<prices.length;i++){
            if(prices[buy]>prices[i]) buy=i;
            else if(prices[buy]<prices[i]) {
                profit=prices[i]-prices[buy];
                max=Math.max(profit,max);
            }
        }
        

         System.out.println(max);
    }
}