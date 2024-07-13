class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
       
        List<Integer> nLine=new ArrayList();
        for(int i=0;i<positions.length;i++)
            nLine.add(i);
        nLine.sort((a,b)->Integer.compare(positions[a],positions[b]));
        
        Stack<Integer> actualIndex =new Stack();
        for(int index:nLine)
        {
            if(directions.charAt(index)=='R')
                actualIndex.push(index);
            else
            {
                while(!actualIndex.isEmpty() && healths[index]>0)
                {
                    if(healths[actualIndex.peek()]>healths[index])
                    {
                        healths[actualIndex.peek()]-=1;
                        healths[index]=0;
                    }
                    else if(healths[actualIndex.peek()]<healths[index])
                    {
                        healths[actualIndex.pop()]=0;
                         healths[index]-=1;
                    }
                    else
                        {
                           healths[index]=0;
                           healths[actualIndex.pop()]=0;            
                        }  
                }
            }
        }
        
        List<Integer> output=new ArrayList();
        for(int h:healths)
        {
            if(h>0)
                output.add(h);
        }
        
        return output;
            
    }
}