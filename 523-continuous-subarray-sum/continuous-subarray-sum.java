class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      
        HashMap<Integer,Integer> hmap=new HashMap();
        int sum=0;
       for(int i=0;i<nums.length;i++)
       {
           sum+=nums[i];
           sum=sum%k;
         if(hmap.containsKey(sum) && i-hmap.get(sum)>=2)
                 return true;
         if(sum==0 && i>0)
             return true;
          if(!hmap.containsKey(sum))
               hmap.put(sum,i);
       }
       
        return false;
    }
}