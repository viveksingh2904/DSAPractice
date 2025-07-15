class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Move right pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Edge case: remove head itself
        if (fast == null) return head.next;

        // Step 2: Move both pointers until right reaches last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Delete the node
        slow.next = slow.next.next;

        return head;
    }
}
