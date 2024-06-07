class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        String[] sarray=sentence.split(" ");
        StringBuilder output=new StringBuilder();
        for(String s: sarray)
        {
            for(String d:dictionary)
            {
                if(s.startsWith(d))
                    s=d;
            }
         output.append(s).append(" ");            

        }
    return output.toString().trim();
    }
}