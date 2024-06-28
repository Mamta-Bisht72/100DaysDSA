class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     
        int start=1,end=(int)1e6;
        while(start<end)
        {
            int tsum=0;
            int mid=start+(end-start)/2;
            for(int i:nums)
                tsum+=(i+mid-1)/mid; // to get ceil value;
            if(tsum>threshold)
               start=mid+1; 
            else
                end=mid;
            
        }
        return start;
        
        
    }
}