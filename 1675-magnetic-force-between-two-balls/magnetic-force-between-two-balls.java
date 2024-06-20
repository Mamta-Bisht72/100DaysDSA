class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start=0;
        int end=position[position.length-1];
        int force=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(minForce(position,m,mid))
            {
                force=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return force;
    }
      private boolean minForce(int[] position, int m, int max) {
        int count = 1;
        int last = position[0];
        for (int i=0;i<position.length;i++) {
            if (position[i]-last>=max) {
                last=position[i];
                count++;
            }
        }
        return count>=m;
    }
}