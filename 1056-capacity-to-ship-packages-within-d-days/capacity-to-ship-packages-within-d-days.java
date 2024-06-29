class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int start=0;
        int end=0;
        for(int i:weights)
        {
            end+=i;
            start=Math.max(start,i);   
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(TotalDays(mid,weights)<=days)
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
        
    }
    
    int TotalDays(int capacity,int[] weights)
    {
        int load=0;
        int day=1;
        for(int i:weights)
        {
            if(load+i<=capacity)
              load+=i;
            else
            {
                day+=1;
                load=i;
            }
        }
        return day;
    }
}