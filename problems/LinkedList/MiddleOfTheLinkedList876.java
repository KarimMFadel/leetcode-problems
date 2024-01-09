package LinkedList;

public class MiddleOfTheLinkedList876{
    public static void main(String[] args) {
        // first tastCase
        // Input: head = [1,2,3,4,5]
        // Output: [3,4,5]

        // Second tastCase
        // Input: head = [1,2,3,4,5,6]
        // Output: [4,5,6]
    }

    public ListNode middleNode(ListNode head) {
        ListNode middle = head, end = head;
        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
    
}
