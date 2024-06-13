class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        Arrays.sort(seats);
        Arrays.sort(students);
        int count=Math.max(seats[0],students[0])-Math.min(seats[0],students[0]);
        for(int i=1;i<seats.length;i++)
        {
                count+=Math.max(seats[i],students[i])-Math.min(seats[i],students[i]);
                
        }
        return count;
        
    }
}