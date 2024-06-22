class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int cur = 0,ans = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        for (int i=0;i<nums.length;i++) {
            cur += nums[i] % 2 == 1 ? 1 : 0;
            hmap.put(cur,hmap.getOrDefault(cur,0)+1);
            ans+=hmap.getOrDefault(cur-k,0);
        }
        return ans; 
    }
}