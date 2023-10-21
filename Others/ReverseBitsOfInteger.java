public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int reverse = 0;
        for (int i = 0; i < 32; i++){
            reverse = reverse << 1;
            
            // if the bit is 1 add it as the last bit 
            if ((n & 1) == 1){
                reverse = reverse ^ 1;
            }
            n = n >>> 1;
        }
        return reverse;
    }
}
