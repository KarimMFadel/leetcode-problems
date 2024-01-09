package LinkedList;

public class RemoveNthNodeFromEndOfList19 {
    public static void main(String[] args) {
        
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head, prevDesignedNode = null;
        int move = 1;
        while(end != null) {
            // move to make the distance between the (end node, prevDesignedNode) equal n  
            if(move < n) {
                move ++;
                end = end.next;
                continue;
            }

            // when the end node reach the end, so the designedNode will be exist on the previouse of DesignedNode
            if(end.next == null ) {
                if(n != 1 && prevDesignedNode != null) {
                    prevDesignedNode.next = prevDesignedNode.next.next;
                    break;
                } else if (n == 1 && prevDesignedNode != null) {
                    prevDesignedNode.next = null;
                    break;
                } else if (n != 1 && prevDesignedNode == null) {
                    return head.next;
                } else if (n == 1 && prevDesignedNode == null) {
                    return null;
                } 
            }

            // we need to move the end and prevDesignedNode by one move 
            end = end.next;
            if(prevDesignedNode == null)
                prevDesignedNode = head;
            else
                prevDesignedNode = prevDesignedNode.next;
        }
        
        return head;
    }

    // OldSolution
    public ListNode removeNthFromEndOldSolution(ListNode head, int n) {
        ListNode end = head;
        int length = 0;
        while(end != null) {
            length++;
            end = end.next;
        }
        
        int removedNodeIndex = length - n;

        System.out.println("length " + length + " removedNodeIndex " + removedNodeIndex );

        ListNode start = head, prevNode = null;
        while(start != null) {
            if (removedNodeIndex == 0 && prevNode == null && start.next == null) {
                return null;
            } else if (removedNodeIndex == 0 && prevNode == null) {
                return head.next;
            } else if (removedNodeIndex == 0 ) {
                prevNode.next = start.next;
                break;
            }
            prevNode = start;
            start = start.next;
            removedNodeIndex--;
        }

        return head;
    }
}
