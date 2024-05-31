class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> hmap=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(target-nums[i]))
            {
                arr[0]=hmap.get(target-nums[i]);
                arr[1]=i;
            }
            hmap.put(nums[i],i);
               
        }
        return arr;
    }
}

/*
hmap=2,0
hmap=7,1
hmap.get(9-7)
hmap.get(2)=0
arr[0]=0
arr[1]=i=1;
*/