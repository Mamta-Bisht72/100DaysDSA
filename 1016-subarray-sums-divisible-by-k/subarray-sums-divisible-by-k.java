class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      
        HashMap<Integer,Integer> hmap=new HashMap();
        hmap.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=(sum+nums[i])%k;
            if(sum<0)
                sum+=k;
            count+=hmap.getOrDefault(sum,0);
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}