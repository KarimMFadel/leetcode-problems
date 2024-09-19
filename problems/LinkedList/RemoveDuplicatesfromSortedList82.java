package LinkedList;

public class RemoveDuplicatesfromSortedList82 {

    public static void main(String[] args) {
        // first tastCase
        // Input: head = [1,1,2,2,3]
        // Output: [2,3]
        ListNode node = 
            new ListNode(1, 
                new ListNode(2, 
                    new ListNode(2, null)));
        // System.out.println(deleteDuplicates(node));
    }

    public ListNode deleteDuplicates(ListNode head) {
        int previousVal = -101;
        ListNode start = head, prevNode = null;
        while (start != null && start.next != null) {
            
            if(start.val == start.next.val) {
                previousVal = start.val;
                if (prevNode != null) {
                    prevNode.next = start.next.next;
                } else {
                    head = start.next.next;
                }
                start = start.next.next;
            } else if (start.val == previousVal) {
                if (prevNode != null) {
                    prevNode.next = start.next;
                } else {
                    head = start.next;
                }
                start = start.next;
            } else {
                prevNode = start;
                start = start.next;
            }
        }

        if (start != null && start.val == previousVal) {
            if (prevNode != null) {
                prevNode.next = null;
            } else {
                head = null;
            }
        }
        return head;
    }
}
