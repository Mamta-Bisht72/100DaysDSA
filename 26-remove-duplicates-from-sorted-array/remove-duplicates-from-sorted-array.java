class Solution {
    public int removeDuplicates(int[] nums) {
     // 1 2 3 3 3 4 5 5 
    //
        int i=0;
        int j=1;
        while(i<j && j<nums.length)
        {
           
            if(nums[i]==nums[j])
            j++;
            else
            {
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}