class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num == prev){
                return true;
            }
            prev = num;
        }
        
        return false;
    }
}
