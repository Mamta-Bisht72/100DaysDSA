class Solution {
    public void nextPermutation(int[] nums) {
     int index=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        
        if(index==-1)
        {
            int i=0;
            int j=nums.length-1;
            while(i<j)
            {
               int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
             
           }
            return;
        }
    //swap just greater element
     for(int i=nums.length-1;i>index;i--)
     {
         if(nums[i]>nums[index])
         {
         int temp=nums[i];
         nums[i]=nums[index];
         nums[index]=temp;
             break;
        }
    }
    // reverse remaining elements now
    int l=index+1;
            int r=nums.length-1;
            while(l<r)
            {
                int temp=nums[l];
                nums[l]=nums[r];
               nums[r]=temp;
                l++;
                r--;
             
           }
 }
}