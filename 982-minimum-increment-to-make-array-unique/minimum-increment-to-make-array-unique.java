class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        //1 1 2 2 3 7 
        //1 2 3 4 5 7
        //1+1+2+2+0=6
        int count=0;
      for(int i=1;i<nums.length;i++)
      {
          if(nums[i]<=nums[i-1])
          {
             count+=nums[i-1]-nums[i]+1;
             nums[i]=nums[i-1]+1;
              
          }
      }
        return count;

    }
}