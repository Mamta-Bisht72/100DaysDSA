class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal=new ArrayList();
        
        for(int i=0;i<numRows;i++)
        {
        List<Integer> row=new ArrayList();
            for(int j=0;j<i+1;j++)
            {
                if(j==0||j==i)
                    row.add(1);
                else
                {
                    int sum=pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j);
                    row.add(sum);
                }
                
            }
            pascal.add(row);
        }
        
        return pascal;
    }
}