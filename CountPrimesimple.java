class Solution {
    public int countPrimes(int n) {
        
        //Simple implementation of Eratorsthenes sieve
        
        if (n < 2){
            return 0;
        }

        int primes = 0 ;       
        boolean [] grid = new boolean[n]; //default value false
        
        //flagging loop
        for (int i = 2; i < n ; i++){
            
            // 2 is the first prime.. then mark everything in multiple of 2 as true            
            if(!grid[i]){                
                primes++;
                // numbers greather than the square and multiple of the number being tested should be flagged 
                for (int j = i; j < n; j = j+i){
                    // System.out.println("j:" + j);
                    grid[j] = true;
                }
            }        
        }
        
        
        return primes;
    }
}
