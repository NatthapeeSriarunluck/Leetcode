public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if (head ==null) return true;
        boolean palindrome = true;
        ListNode reverse = reverseList(head);
        while (head != null) {
            System.out.println(head.val + " : " + reverse.val);
            palindrome = (head.val == reverse.val);
            head = head.next; reverse = reverse.next;
        }
        return palindrome;
    }
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
