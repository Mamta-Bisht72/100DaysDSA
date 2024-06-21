class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {  
        int n=customers.length;
        int maxUnsatCust=0;
        int currUnsat=0;
        for(int i=0;i<minutes;i++)
        {
            currUnsat+=customers[i]*grumpy[i];
        }
        maxUnsatCust=currUnsat;
        
        int i=0;
        int j=minutes;
        while(j<n)
        {
         currUnsat+=customers[j]*grumpy[j];
         currUnsat-=customers[i]*grumpy[i];
         maxUnsatCust=Math.max(maxUnsatCust,currUnsat);
            i++;
            j++;
            
        }
        
        int totalSat=maxUnsatCust;
        for(int k=0;k<n;k++)
        {
            totalSat+=customers[k]*(1-grumpy[k]);
        }
        
        return totalSat;
    }
}