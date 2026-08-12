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
    public ListNode partition(ListNode head, int x) {
        ListNode part1=new ListNode();
        ListNode part2=new ListNode();

        ListNode small=part1;
        ListNode large=part2;

        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }
            else{
                large.next=head;
                large=large.next;
            }

            head=head.next;
        }

        large.next=null;
        small.next=part2.next;

        return part1.next;
    }
}