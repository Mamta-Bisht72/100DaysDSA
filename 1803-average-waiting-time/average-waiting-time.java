class Solution {
    public double averageWaitingTime(int[][] customers) {
     double finish=0;
     double waiting=0;
    double arrive=0;
    double orderTime=0;
        
        for(int i=0;i<customers.length;i++)
        {
            arrive=customers[i][0];
            orderTime=customers[i][1];
            if(finish<arrive)
                finish=arrive+orderTime;
            else
             finish+=orderTime;
            waiting+=finish-arrive;    
        }
        
        return waiting/customers.length;
    }
}