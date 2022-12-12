import java.util.HashSet;
import java.util.Set;

public class Linked_Link_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head; ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
