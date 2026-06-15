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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        ListNode dummy = new ListNode();
        while (second != null) {
            ListNode nextNode = second.next;
            second.next = dummy.next;
            dummy.next = second;
            second = nextNode;
        }

        ListNode p1 = head;
        ListNode p2 = dummy.next;
        while (p2 != null) {
            ListNode tmp1 = p1.next;
            ListNode tmp2 = p2.next;

            p1.next = p2;
            p2.next = tmp1;

            p1 = tmp1;
            p2 = tmp2;
        }
    }
}
