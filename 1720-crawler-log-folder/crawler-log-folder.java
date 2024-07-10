class Solution {
    public int minOperations(String[] logs) {
        int move=0;
        for(int i=0;i<logs.length;i++)
        {
            
            if(logs[i].equals("../"))
            {
                
                move--;
                if(move<0)
                 move=0;
            }
            else if(logs[i].equals("./"))
                continue;
            else
                move++;
        }
        return move;
    }
}