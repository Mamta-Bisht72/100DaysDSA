class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
     
        int drink=numBottles;
        int empty=numBottles;
        int total=numBottles;
        while(empty>=numExchange)
        {
          drink=empty/numExchange;
          empty=drink+empty%numExchange;
            total+=drink;
        }
        return total;
    }
}