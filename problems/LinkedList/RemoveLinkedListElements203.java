package LinkedList;

public class RemoveLinkedListElements203 {
    public static void main(String[] args) {
        
        // first testcase
        // Input: head = [1,2,6,3,4,5,6], val = 6
        // Output: [1,2,3,4,5]

        // Second testcase
        // Input: head = [], val = 1
        // Output: []

        // third testcase
        // Input: head = [7,7,7,7], val = 7
        // Output: []

        // Fourth testcase
        // Input: head = [7,6], val = 7
        // Output: [6]

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode start = head, prevNode = null;
        while (start != null) {
            if(start.val == val && prevNode != null) {
                prevNode.next = start.next;
            } else if(start.val == val && prevNode == null && start.next == null) {
                return null;
            } else if(start.val == val && prevNode == null && start.next != null) {
                head = start.next;
                prevNode = null;
            } else {
                prevNode = start;
            }
            start = start.next;
        }
        return head;
    }
}
