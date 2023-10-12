class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
            
        boolean bought = false;
        
        for(int i = 0; i < prices.length - 1; i++){
            
            if (!bought){
                // System.out.println("i: " + i );
                totalProfit -= prices[i];
                bought = true;                
            }
                        
            
            if(prices[i+1] > prices[i]){
                // hold stock    
            } else {
                // sell 
                totalProfit += prices[i];
                bought = false;
            }
            
            // System.out.println("Total profit: " + totalProfit);
            
        }
        
        if(bought){
            totalProfit += prices[prices.length - 1];
        }
            
        return totalProfit;
    }
}
