class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start=0;
        int end=nums.length-1;
        int arr[]=new int[2];
        int first=-1;
        int last=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
             first=mid;
             end=mid-1;
            }
            else if(target<nums[mid])
                end=mid-1;
            else 
                start=mid+1;
        }
        start=0;
        end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
             last=mid;
             start=mid+1;
            }
            else if(target<nums[mid])
                end=mid-1;
            else 
                start=mid+1;
        }
        
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}