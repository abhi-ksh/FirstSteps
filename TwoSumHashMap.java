class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int [] result = new int [2];
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)){
                result [0] = numToIndex.get(complement);
                result [1] = i;
                return result;
            } else {
                numToIndex.put(nums[i], i);
            }
        }

        return null;

    }
}
