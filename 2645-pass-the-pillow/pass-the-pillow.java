class Solution {
    public int passThePillow(int n, int time) {
        
        // calculate no of rotations
        int rounds=time/(n-1);
        int pos=time%(n-1);
        return rounds%2==0? pos+1:n-pos;
    }
}