class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        // Brute force if arr[i]<k then increase k value else answer will be k
        for(int i:arr)
        {
            if(i<=k)
                k++;
            else
                break;
                
        }
        return k;
    }
}