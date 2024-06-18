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
        Map.Entry<Integer, Integer> entry = null;
        for(int i=0;i<worker.length;i++)
        {
            if(tmap.containsKey(worker[i]))
            {
                 maxprofit+=tmap.get(worker[i]);
               
            }
            else
            {
                entry=tmap.floorEntry(worker[i]);
                if(entry!=null)
                maxprofit+=entry.getValue();
            }
        }
        
        return maxprofit;
        
        
    }
}