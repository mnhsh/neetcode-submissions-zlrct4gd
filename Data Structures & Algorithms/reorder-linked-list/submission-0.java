class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode dummy = new ListNode();
        while (secondHalf != null) {
            ListNode nextNode = secondHalf.next;
            secondHalf.next = dummy.next;
            dummy.next = secondHalf;
            secondHalf = nextNode;
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