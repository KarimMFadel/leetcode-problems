package LinkedList;

public class DeleteTheMiddleNodeofALinkedList2095 {
    public static void main(String[] args) {
        // first testcase
        // Input: head = [1,2,3,4]
        // Output: [1,2,4]

        // Second testcase
        // Input: head = [2,1]
        // Output: [2]

        // third testcase
        // Input: head = [1]
        // Output: []
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
            
        ListNode middle = head, end = head, previousMiddle = head;
        while (end != null && end.next != null) {
            previousMiddle = middle;
            middle = middle.next;
            end = end.next.next;
        }

        previousMiddle.next = middle.next;

        return head;
    }
}
