class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       // 1,2,3,2,3,4,6,7,8
        if(hand.length%groupSize!=0)
            return false;
        Map<Integer,Integer> hmap=new HashMap();
        for(int i:hand)
        {
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
                Arrays.sort(hand);

        for (int i = 0; i < hand.length; i++) {
            if (hmap.get(hand[i]) == 0) {
                continue;
            }
            
            for (int j = 0; j < groupSize; j++) {
                int currCard = hand[i] + j;
                
                if (hmap.getOrDefault(currCard, 0) == 0) {
                    return false;
                }
                
                hmap.put(currCard, hmap.get(currCard) - 1);
            }
        }
        
        return true;
        
    }
}