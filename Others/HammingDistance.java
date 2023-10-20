class Solution {
    public int hammingDistance(int x, int y) {
        int hDistance = 0;
        
        for (int i = 0; i < 32; i++){
            int xBit = (x >>> i & 1);
            int yBit = (y >>> i & 1);
            if (xBit != yBit){
                hDistance++;
            }            
        }
        
        return hDistance;
        
    }
}
