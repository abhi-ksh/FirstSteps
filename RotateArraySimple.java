class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums2 = nums.clone();
        for(int i = 0; i < nums2.length; i++){
            int newIndex = (i + k) % nums2.length;
            nums[newIndex] = nums2[i];
        }
        // printArray(nums2);                

    }
    
    public void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
