class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       
        TreeMap<Integer,Integer> tmap=new TreeMap();
        // difficulty->profit
        for(int i=0;i<profit.length;i++)
        {
            tmap.put(difficulty[i],Math.max(profit[i],tmap.getOrDefault(difficulty[i],0)));
        }
        
        int max=0;
        for(Integer k:tmap.keySet())
        {
            max=Math.max(tmap.get(k),max);
            tmap.put(k,max);
        }
        
        int maxprofit=0;
        for (int i=0;i<worker.length;i++) 
        {
            
            Integer key=tmap.floorKey(worker[i]);
            if(key!=null)
                maxprofit+=tmap.get(key);
        }
        
        return maxprofit;   
        
    }
}