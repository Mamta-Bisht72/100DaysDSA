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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
       ListNode temp=head;
     while(temp!=null)
     {
         ListNode start=temp;
         int sum=0;
         while(start.val!=0)
         {
             sum+=start.val;
             start=start.next;
         }
         // next 0 is there so add the modified list       
         temp.val=sum;
         temp.next=start.next;
         temp=temp.next;
     }
        
            return head;

    }
}