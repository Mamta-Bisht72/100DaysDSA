class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        if(nums.length==1)
            return 0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            // edge case for first and last element
            if(mid>0 && mid<nums.length-1)
            {
                if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
                else if(nums[mid+1]>nums[mid])
                    start=mid+1;
                else
                    end=mid-1;
                
            }
            
            else if(mid==0)
            {
                if(nums[0]>nums[1])
                return 0;
                else
                    return 1;
            }
              else if(mid==nums.length-1)
                {
                    if(nums[mid]>nums[mid-1])
                      return mid;
                   else
                 return mid-1;
              }
            
            
        }
        
    return -1;
    }
}