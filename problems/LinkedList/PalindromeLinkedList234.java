package LinkedList;

import java.util.Stack;

public class PalindromeLinkedList234 {
    
    /*
     * link:- https://leetcode.com/problems/palindrome-linked-list/description/
     */
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode middle = head, end = head;
        
        while (end != null && end.next != null) {
            stack.push(middle.val);
            middle = middle.next;
            end = end.next.next;
        }
        if(end != null)
            middle = middle.next;

        while(middle != null) {
            if(middle.val != stack.pop())
                return false;
            middle = middle.next;
        }

        return true;
    }
}
