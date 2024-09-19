package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNodeInLinkedList1019 {   // copied solution
    // [2,1,5]
    // [2,7,4,3,5]
    // [2,7,4,3,15]      Output [7,0,15,15,0] Expected [7,15,15,15,0]
    // [2,7,4,1,3,3]
    // [2]
    // [2,7,4,3,15]
    // [1,3,3,3,6]
    // [1,2,3,4]         Output [4,4,4,0] Expected [2,3,4,0]
    // [7,1,3,4,4,4,1]   Output [0,4,4,0,0,0,0] Expected [0,3,4,0,0,0,0]
    public static int[] nextLargerNodes(ListNode head) {    
         ListNode temp1=head;
       ListNode temp2=head;
       ListNode temp3=head;
       List<Integer>li=new ArrayList<>();
       while(temp2!=null)
       {
           while(temp1!=null)
           {
               if(temp3.val<temp1.val)
               {
                   li.add(temp1.val);
                   break;

               }
               temp1=temp1.next;
           }
           if(temp1==null)
           {
               li.add(0);
           }
           temp2=temp2.next;
           temp3=temp3.next;
           temp1=temp2;
       }
       int arr[]=new int[li.size()];
       for(int i=0;i<li.size();i++)
       {
           arr[i]=li.get(i);
       }
       return arr;
    }


    public static int[] badNextLargerNodes(ListNode head) {
        Stack<Integer> answer = new Stack<Integer>();
        int lastGreaterValue = head.val;
        if (head.next == null) {
            return new int[] {0};
        }
        int countGreater = 0;
        int settedCount = 0;
        ListNode end = head.next;
        while (end != null) {

            if(!answer.empty() && answer.peek() < end.val && answer.peek() != 0) {    // && answer.peek() != 0  [1,4,3,3,3]
            
                for (int i = 0; i < settedCount; i++) {
                    answer.pop();
                }
                settedCount++;
                for (int i = 0; i < settedCount; i++) {
                    answer.push(end.val);
                }

            } else if (!answer.empty() && answer.peek() >= end.val) {   // (=) for  [2,7,4,1,3,3] and [1,4,3,3,3]
                answer.push(0);
                settedCount = 1;
                head = end;
                lastGreaterValue = end.val;
                countGreater=1;

            } else if (head.val < end.val) {  // don't add equal [1,4,3,3,3]  and [2,7,4,3,3,3,3,5]

                if (lastGreaterValue < end.val && countGreater > 0) {  // [2,7,4,3,3,3,3,5]
                    for (int i = 0; i < countGreater; i++) {
                        answer.pop();
                    }
                    for (int i = 0; i < countGreater; i++) {
                        answer.push(end.val);
                    }
                } 
                settedCount++;
                answer.push(end.val);
                
                
            } else if (head.val >= end.val) {  
                if (lastGreaterValue <= head.val) {  // (=) for  [1,4,3,3,3] and [2,7,4,3,3,3,3,5]
                    lastGreaterValue = head.val;
                    if (head.val != end.val)
                        countGreater=0;
                }
                answer.push(0);
                countGreater++;
                head = head.next;
            }
            end = end.next;
        }
        answer.push(0);
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) result[i] = answer.get(i);
        return result;
    }

    public static void main(String[] args) {
        ListNode node =
            new ListNode(1,
                new ListNode(3,
                    new ListNode(3,
                        new ListNode(3,
                            new ListNode(6)))));
        // ListNode node =
        //     new ListNode(2,
        //         new ListNode(7,
        //             new ListNode(4,
        //                 new ListNode(1,
        //                     new ListNode(3,
        //                         new ListNode(3))))));

        // splitListToParts(node, 6);
        // splitListToParts(node, 10);
        nextLargerNodes(node);
        // splitListToParts(null, 4);
    }

}
