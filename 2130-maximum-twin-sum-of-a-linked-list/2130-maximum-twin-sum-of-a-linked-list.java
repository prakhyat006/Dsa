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
    public int pairSum(ListNode head) {
        ArrayList<Integer> ls=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            ls.add(cur.val);
            cur=cur.next;
        }
        System.out.println(ls);
        int max=Integer.MIN_VALUE;
        int j=ls.size()-1;
        int i=0;
        while(i<j){
            max=Math.max(max,ls.get(i)+ls.get(j));
            i++;
            j--;
        }
        return max;
    }
}