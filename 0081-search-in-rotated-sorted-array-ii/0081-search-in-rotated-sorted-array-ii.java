class Solution {
    public boolean search(int[] arr, int target) {
        
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return true;
            if(arr[mid]==arr[start] && arr[mid]==arr[end])
            {
                start=start+1;
                end=end-1;
                continue;
            }
            // right sorted
            
            if(arr[mid]<=arr[end])
            {
                if(arr[mid]<=target && target<=arr[end])
                {
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
            
            else
            {
                if(arr[start]<=target && target<=arr[mid])
                {
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
        }
        return false;
    }
}