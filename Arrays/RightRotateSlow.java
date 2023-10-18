class Solution {
    public void rotate(int[] nums, int k) {        
        k = k % nums.length;
        for (int j = 0; j < k; j++){
            //shift right by 1 position                        
            int i = nums.length - 1;
            int temp = nums[i];
            
            for(i = nums.length - 1; i > 0 ; i--){
                nums[i] = nums[i-1];
            }

            nums[i] = temp;
            // printArray(nums);            
        }
        

    }
    
    public void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.printf(nums[i] + "," );

        }
        System.out.println("\n");        
    }
}
