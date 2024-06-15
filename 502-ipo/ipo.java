class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       /*
       k=2
       
       */
        // profit,capital
          PriorityQueue<int[]> Cap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> Pro = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        
        for (int i=0;i<profits.length;i++) {
            Cap.add(new int[] {capital[i],profits[i]});
        }
        
        for (int i=0;i<k;i++) {
            while (!Cap.isEmpty() && Cap.peek()[0]<=w) {
                Pro.add(Cap.poll());
            }    
            if (Pro.isEmpty()) break;
            w+= Pro.poll()[1];
        }
        
        return w;
        
    }
}