class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positives[]=new int[nums.length/2];
        int negatives[]=new int[nums.length/2];
        int n=nums.length;
        int pind=0;
        int nind=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                positives[pind]=nums[i];
                pind++;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(nums[j]<0)
            {
                negatives[nind]=nums[j];
                nind++;
            }
        }
        pind=0;
        nind=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                nums[i]=positives[pind++];
            else
                nums[i]=negatives[nind++];
        }
        return nums;
    }
}