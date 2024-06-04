class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> hset=new HashSet();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(hset.contains(s.charAt(i)))
            {
                hset.remove(s.charAt(i));
                count++;
            }
            else
                hset.add(s.charAt(i));
        }
        if(hset.isEmpty())
            return count*2;
        else
            return count*2+1;
        
        
        
        /*
        HashMap<Character,Integer> hmap=new HashMap();
        int slength=0;
        int oddcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(hmap.containsKey(s.charAt(i)))
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            else
                hmap.put(s.charAt(i),1);
        }
        for(Integer count: hmap.values())
        {
            if(count%2==0)
            slength+=count;
            else
            {
                slength+=count-1;
                oddcount++;
            }
            
        }
        
if(oddcount>0)
    return slength+1;
else
    return slength;
    */
    }
}