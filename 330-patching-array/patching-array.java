class Solution {
    public int minPatches(int[] nums, int n) {
     
        long missingValue=1;
        int patch=0;
        int index=0;
        while(missingValue<=n)
        {
            if(index<nums.length && nums[index]<=missingValue)
            {   
                missingValue+=nums[index];
                index++;
            }
            else
            {
               patch++;
                missingValue+=missingValue;
                
            }
        }
        return patch;
        
    }
}