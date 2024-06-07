class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int fcount=0;
        int scount=0;
        int fmajor=Integer.MIN_VALUE;
        int smajor=Integer.MIN_VALUE;
        List<Integer> major=new ArrayList();
        for(int i=0;i<nums.length;i++)
        {
            if(fcount==0 && smajor!=nums[i])
            {
                fmajor=nums[i];
                fcount=1;;
            }
            else if(scount==0 && fmajor!=nums[i])
            {
                scount=1;
                smajor=nums[i];
            }
            else if(fmajor==nums[i])
                fcount++;
            else if(smajor==nums[i])
                scount++;
            else
            {
                fcount--;
                scount--;
            }
        }
        int check=nums.length/3;
        fcount=scount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(fmajor==nums[i])
                fcount++;
            else if(smajor==nums[i])
                scount++;
        }
        if(fcount>check)
            major.add(fmajor);
        if(scount>check)
            major.add(smajor);
        return major;
            
    }
}