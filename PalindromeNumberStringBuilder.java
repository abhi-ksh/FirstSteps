class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers and number divisible by zero are never palindromes
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        StringBuilder xStb = new StringBuilder(Integer.toString(x));
        // System.out.println(xStb.toString() + "|" + xStb.reverse().toString());
        if(xStb.toString().equals(xStb.reverse().toString())){
            return true;
        }
        return false;
    }
}
