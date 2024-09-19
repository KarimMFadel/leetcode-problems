package LinkedList;

public class SplitLinkedListinParts725 {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] listNodes = new ListNode[k];
        ListNode start = head;
        int length = 1, position=0;
        while (start != null && start.next != null) {
            length++;
            start = start.next;
        }
        int sizePerArray = length/k;
        if (sizePerArray == 0) {  // incase the nodes length < K
            while (head != null) {
                listNodes[position] = new ListNode(head.val);
                position++;
                head = head.next;
            }
            return listNodes;
        }
        int exceptionSize = length < k ? 0 : length%k;
        ListNode temp = head;
        ListNode temp2 = temp;
        for (int i = 0; i < k; i++) {
            ListNode newPart = temp;
            
            int ModifiedSizePerArray = sizePerArray;
            if (exceptionSize > 0) 
                ModifiedSizePerArray = sizePerArray + 1;

            for (int j = 0; j < ModifiedSizePerArray; j++) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            listNodes[i] = newPart;
            exceptionSize--;
        }

        return listNodes;
    }

    public static void main(String[] args) {
        ListNode node = 
            new ListNode(1, 
                new ListNode(2,
                    new ListNode(3, 
                        new ListNode(4, 
                            new ListNode(5,
                                new ListNode(6, null))))));

        // splitListToParts(node, 6);
        // splitListToParts(node, 10);
        splitListToParts(node, 4);
        // splitListToParts(null, 4);
    }

}
