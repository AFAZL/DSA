
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class linkcycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        linkcycle solution = new linkcycle();

        // Creating a list with no cycle
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        // Testing the list with no cycle
        System.out.println("Test 1: " + solution.hasCycle(node1)); // should return false

        // Creating a list with a cycle
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node4.next = node5;
        node5.next = node6;
        node6.next = node4; // cycle here

        // Testing the list with a cycle
        System.out.println("Test 2: " + solution.hasCycle(node4)); // should return true
    }
}
