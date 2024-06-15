class Solution {
    public int findMin(int[] nums) {
        
        int n=nums.length;
        int start=0;
        int end=n-1;
        if(n==1)
            return nums[0];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[prev]>nums[mid] && nums[next]>nums[mid])
                return nums[mid];
            else if(nums[mid]<nums[end])
                end=mid-1;
            else
                start=mid+1;
        }
        return 0;
    }
}