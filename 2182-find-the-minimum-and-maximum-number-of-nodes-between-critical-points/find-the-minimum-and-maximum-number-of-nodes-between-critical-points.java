/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
          if (head == null || head.next == null || head.next.next == null)
            return new int[]{-1, -1};
        int prev=head.val;
        ListNode curr=head.next;
        int index=1;
        List<Integer> criticalPoints = new ArrayList<>();
        while(curr.next!=null)
        {
            int nextnode=curr.next.val;
            if(curr.val>prev && curr.val>nextnode|| curr.val<prev && curr.val<nextnode)
                criticalPoints.add(index);   
            prev=curr.val;
            curr=curr.next;
            index++;
        }
        
        if(criticalPoints.size()<2)
            return new int[]{-1,-1};
        
        int min=Integer.MAX_VALUE;
        int max=criticalPoints.get(criticalPoints.size()-1)-criticalPoints.get(0);
        
        for(int i=1;i<criticalPoints.size();i++)
            min=Math.min(min,criticalPoints.get(i)-criticalPoints.get(i-1));
        
        return new int[]{min,max};
    }
}