class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> hmap=new HashMap();
        for(char c: words[0].toCharArray())
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        
        for(int i=1;i<words.length;i++)
        {
            HashMap<Character,Integer> count=new HashMap();
            for(char c: words[i].toCharArray())
              count.put(c,count.getOrDefault(c,0)+1);  
            for(char c:hmap.keySet())
            {
                int minvalue=Math.min(hmap.get(c),count.getOrDefault(c,0));
                hmap.put(c,minvalue);
            }
        }
        
        List<String> common=new ArrayList();
        for(char c:hmap.keySet())
        {
            for(int i=0;i<hmap.get(c);i++)
                common.add(String.valueOf(c));
        }
        return common;
    }
}