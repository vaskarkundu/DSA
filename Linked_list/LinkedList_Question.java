package Linked_list;
import java.util.*;

public class LinkedList_Question {

     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }


    public ListNode swapPairs(ListNode head) {

        return head;
        
    }

//     Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

public ListNode removeNthFromEnd(ListNode head, int n) {
    int i = 0;
    ListNode pre = head;
    ListNode curr = head.next;
    int len = 0;
    while (head.next != null) {
        len++;
      
    }
    int x = len - n;
    while (i < x - 1) {

        pre = pre.next;
        curr = curr.next;
        i++;

    
    }
    pre.next = curr.next;

    return head;
        
}



    public static void main(String[] args) {
        
    }
    
}
