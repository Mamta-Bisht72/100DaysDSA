class Solution {
    public int subarraySum(int[] nums, int k) {
      
        HashMap<Integer,Integer> hmap=new HashMap();
        int sum=0;
        hmap.put(0,1);
        //store sum and sum occurs how many times
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
          if(hmap.containsKey(sum-k))
          {
              count+=hmap.get(sum-k); 
          }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}