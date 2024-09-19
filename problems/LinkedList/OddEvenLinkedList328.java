package LinkedList;

public class OddEvenLinkedList328 {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode even = new ListNode(head.val);
        if (head.next == null) {
            return head;
        }
        head = head.next;
        ListNode odd = new ListNode(head.val);
        ListNode tempEven = even, tempOdd = odd;
        int i = 2;
        head = head.next;
        while (head != null) {
            if (i%2 == 0) {
                even.next = new ListNode(head.val);
                even = even.next;
            } else {
                odd.next = new ListNode(head.val);
                odd = odd.next;
            }
            i++;
            head = head.next;
        }

        even.next = tempOdd;
        return tempEven;
    }

    public static void main(String[] args) {
        ListNode node = 
            new ListNode(1, 
                new ListNode(2,
                    new ListNode(3, 
                        new ListNode(4, 
                            new ListNode(5,
                                new ListNode(6, null))))));

        oddEvenList(node);
    }
}
