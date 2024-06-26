class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> tsum=new ArrayList();
        int sum=0;
       for(int i=0;i<nums.length;i++)
        {
          if(i>0 && nums[i]==nums[i-1])
                  continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                    k--;
                else if(sum<0)
                    j++;
                else
                {
                 List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
                    tsum.add(list);
                    j++;
                    k--;
                while(j<k && nums[j]==nums[j-1])
                    j++;
                while(k>j && nums[k]==nums[k+1])
                    k--;
                }
               
            }
            
        }
     return tsum;
        
        //[-1,0,1,2,-1,-4]
        // i!=j ,i!=k, j!=k
        /*
        Set<List<Integer>> set=new HashSet();
        Set<Integer> hset;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            hset=new HashSet();    
            for(int j=i+1;j<n;j++)
            {
             int sum=nums[i]+nums[j];
            if(hset.contains(-sum))
            {
                List<Integer> list=new ArrayList();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(-sum);
                Collections.sort(list);
                set.add(list);
            }
                hset.add(nums[j]);
                
            }
        }
       List<List<Integer>> tsum=new ArrayList();
        tsum.addAll(set);
        return tsum;*/
   
    }
}