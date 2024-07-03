class Solution {
    public int minDifference(int[] nums) {
       int n = nums.length;
        if (n <= 4) 
            return 0; 
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            min = Math.min(min, nums[n - 4 + i] - nums[i]); 
        }
        return min; 
    }
}