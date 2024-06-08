class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        List<List<Integer>> output=new ArrayList();
        for(int i=0;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
             // as(1,3), (2,4),(2,6) here (2,4) will be skipped as its already part of interval (1,6)
            if(!output.isEmpty() && end<=output.get(output.size()-1).get(1))
                continue;
            for(int j=i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]<=end)
                {
                    end=Math.max(end,intervals[j][1]);
                }
                else
                    break;
            }
            output.add(Arrays.asList(start,end));
            
        }
        int [][] intArray=output.stream().map(u->u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
        
        return intArray;

    }
}

/*
 Arrays.sort(intervals,(i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        List<List<Integer>> output=new ArrayList();
        for(int i=0;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
             // as(1,3), (2,4),(2,6) here (2,4) will be skipped as its already part of interval (1,6)
            if(!output.isEmpty() && end<=output.get(output.size()-1).get(1))
                continue;
            for(int j=i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]<=end)
                {
                    end=Math.max(end,intervals[j][1]);
                }
                else
                    break;
            }
            output.add(Arrays.asList(start,end));
            
        }
        return output.toArray(new int[output.size()][]);
*/