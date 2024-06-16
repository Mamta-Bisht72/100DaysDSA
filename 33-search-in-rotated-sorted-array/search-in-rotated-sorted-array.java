class Solution {
    public int search(int[] arr, int target) {
   
        // find min index
        // search in(nums,start,index-1)
        //search in (nums,index,end);
        //before min index and after min index array is sorted
        
        int start=0;
        int end=arr.length-1;
        
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target)
                return mid;
            //find sorted half
            //is left part sorted
           else if(arr[mid]<=arr[end]) 
            {
                // check target values lies in that sorted part
                if(arr[mid]<=target && target<=arr[end])
                {
                    start=mid+1;
                }
               else
                   end=mid-1;
               
            }
            // is right part sorted
            else
            {
                if(target<=arr[mid] && target>=arr[start])
                {
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            
            
        }
        
        return -1;
    }
}