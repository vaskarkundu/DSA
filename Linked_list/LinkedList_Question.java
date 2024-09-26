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


    // need to swap between pair ; if odd comes then remain last one will be single
//     Input: head = [1,2,3,4]  = [] =[1]
// Output: [2,1,4,3]= [] = [1]
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        ListNode pre = head;
        ListNode curr = head.next;

        while (true) {
            ListNode nexNode = curr.next;
            curr.next = pre;

            if(curr == null || curr.next == null){
                pre.next = nexNode;
                break;
            }
            pre.next = nexNode.next;
            pre.next = nexNode;
            curr = pre.next;
            
        }

        return head;
        
    }

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null || head.next == null){
        head = null;
        return head;
    }
    
    ListNode pre = head;
    ListNode curr = head.next;
    int len = 0;
    ListNode h = head;
    while (h != null) {
        len++;
        head = head.next;
      
    }
    if (len == n) {
        return head.next;
    }
    int i = 1;
    int x = len - n;
    while (i < x) {

        pre = pre.next;
        curr = curr.next;
        i++;

    
    }
    pre.next = curr.next;

    return head;
        
}


// reverse the linked list
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode curr = head.next;

        while (curr != null) {
            ListNode nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex; 
        }
        head.next = null;
        head = pre;
    
        return head;
    }

        // Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
        // Input: head = [1,2,3,4,5], left = 2, right = 4
        // Output: [1,4,3,2,5]
        // Example 2:

        // Input: head = [5], left = 1, right = 1
        // Output: [5]
        // Reverse Linked List - II
        public ListNode reverseBetween(ListNode head, int left, int right) {
                return head;
        }
     

        // Check if a Linked List is a palindrome ==> try to solve it by own

        // Detecting Loop in a Linked List.  ==  




    public static void main(String[] args) {
        
    }
    
}
