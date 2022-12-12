import java.util.HashSet;
import java.util.Set;

public class Linked_Link_Cycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null){
            if (seen.contains(head)) {
                return true;
            } else {
                seen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
