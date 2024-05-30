class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int currcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            currcount++;
            else
            {
                count=Math.max(count,currcount);
                currcount=0;
            }
           
        }
        return Math.max(count,currcount);
        
    }
}