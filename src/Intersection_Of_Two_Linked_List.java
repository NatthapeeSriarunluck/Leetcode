public class Intersection_Of_Two_Linked_List {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }
        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public int length(ListNode node) {
        int len = 0;
        while (node!= null) {
            node = node.next;
            len++;
        }
        return len;
    }
}
