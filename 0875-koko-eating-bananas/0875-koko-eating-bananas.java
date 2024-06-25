class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     //FIND MAX ELEMENT
       /* int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
                max=piles[i];
        }
        
        int left=1;
        int right=max;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(canEatBananas(piles,mid,h))
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }
    
    public boolean canEatBananas(int[] piles, int speed,int h)
    {
        long hours=0;
        for(int pile:piles)
        {
            long div=pile/speed;
            hours+=div;
            if(pile%speed!=0)
                hours++;
        }
        return hours<=h;
        */
        
        /*Complexity
Time O(Nlog(MaxP))
Space O(1)*/
        
       int start=1;
        int end=1000000000;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            int total=0;
            for(int pile:piles)
                total+=(pile+mid-1)/mid; // equivalent to ceil(pile/m);
            if(total>h)
                start=mid+1;
            else
                end=mid;
        }
        return start;
        
    }
}