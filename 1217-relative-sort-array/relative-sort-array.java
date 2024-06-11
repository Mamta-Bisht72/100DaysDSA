class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     
       // 1,2,2,2,3,3,4,6,7,9,19
           // 222143396719
            TreeMap<Integer,Integer> hmap=new TreeMap();
        for(int i: arr1)
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        int j=0;
        for(int i:arr2)
        {
            int freq=hmap.get(i);
            while(freq>0)
            {
              arr1[j]=i;
                freq--;
                j++;
            }
            hmap.remove(i);
        }
        
      for(int key: hmap.keySet())
      {
          int count=hmap.get(key);
          while(count>0)
          {
              arr1[j]=key;
              j++;
              count--;
          }
      }  
        return arr1;
        
        
    }
}