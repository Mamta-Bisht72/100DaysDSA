class Solution {
    public int[] rearrangeArray(int[] nums) {
        int rearrange[]=new int[nums.length];
        int n=1;
        int p=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                rearrange[n]=nums[i];
                n=n+2;
            }
            if(nums[i]>0)
            {
                rearrange[p]=nums[i];
                p=p+2;
            }
        }
        return rearrange;
    }
}