class Solution {
    public int longestPalindrome(String s) {
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
    }
}