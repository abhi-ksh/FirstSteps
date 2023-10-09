class Solution {
    public boolean isPalindrome(int x) {
        int xCopy = x;
        // negative numbers and number divisible by zero are never palindromes
        if (x < 0 || (x != 0 && x%10 == 0)) {
            return false;
        }
  
        int reverse = 0;
        while(xCopy > 0){
            reverse = reverse*10 + xCopy%10;
            xCopy = xCopy/10;

            // System.out.println("reverse:" + reverse + " xCopy:" + xCopy);
        }

        if (x == reverse){
            return true;
        }

        return false;
    }
}
