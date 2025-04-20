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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i=0;
        ListNode temp=null;
        ListNode cur=list1;
        ListNode prev=cur;
        while(cur!=null){
            if(i==a){
                while(i!=b){
                    i++;
                    cur=cur.next;
                }
                
                prev.next=cur.next;
                //  System.out.println(cur.next.val);
                temp=cur.next;
                break;
            }
            else {
                i++;
                prev=cur;
                cur=cur.next;
            }
        }
        cur=list1;
        i=0;
        while(cur!=null){
            if(i==a-1){
                cur.next=list2;
                // cur=cur.next;
                // System.out.println(cur.val);
                break;
            }
            else {
                i++;
                cur=cur.next;
            }
        }
        cur=list1;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        return list1;
    }
}