class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)
            return -1;
        int left=0;
        int right=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            left=Math.min(bloomDay[i],left);
            right=Math.max(bloomDay[i],right);
            
        }
        
        while(left<right)
        {
            int mid=left+(right-left)/2;
            int possibleBouquets=canMakeBouquets(bloomDay,mid,k);
            if(possibleBouquets<m)
                left=mid+1;
            else
                right=mid;

        }
        return left;
        }
    
    public int canMakeBouquets(int[] bloomDay,int mid,int k)
    {
        int adjFlowers=0;
        int bouquetsCount=0;
       for(int flowers:bloomDay)
       {
           if(flowers<=mid)
               adjFlowers++;
           else
               adjFlowers=0;
           if(adjFlowers==k)
           {
               bouquetsCount++;
               adjFlowers=0;
           }
           
       }
        return bouquetsCount;
    }
}