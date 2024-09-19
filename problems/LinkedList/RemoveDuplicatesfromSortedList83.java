package LinkedList;

public class RemoveDuplicatesfromSortedList83 {

    public static void main(String[] args) {
        // first tastCase
        // Input: head = [1,1,2,2,3]
        // Output: [1,2,3]
        ListNode node = 
            new ListNode(1, 
                new ListNode(2, 
                    new ListNode(2, null)));
        // System.out.println(deleteDuplicates(node));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode end = head;
        while (end != null && end.next != null) {
            if (end.val == end.next.val) {
                end.next = end.next.next;
            } else {
                end = end.next;
            }
        }

        return head;
    }
}
