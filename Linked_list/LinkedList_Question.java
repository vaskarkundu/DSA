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

            if(nexNode == null || nexNode.next == null){
                pre.next = nexNode;
                break;
            }
            pre.next = nexNode.next;
            pre = nexNode;
            curr = pre.next;
            
        }

        head = newHead;

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

    public ListNode reverseList(ListNode head) {
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
            if(head == null){
                return head;
            }

            ListNode dummmy = new ListNode(0);
            dummmy.next = head;
            ListNode pre = dummmy;

            for(int i =0; i<left -1; i++){
                pre = pre.next;
            }
            ListNode curreent = pre.next;
            ListNode nexNode = null;
            ListNode previous = null;
            for(int i = 0; i<=right - left; i++){
                nexNode = curreent.next;
                curreent.next = previous;
                previous = curreent;
                curreent = nexNode;
            }

            pre.next.next = curreent; 
            pre.next = previous;
                
         
            return dummmy.next;
        }

        // calculate middle of a linked list ==>
        public ListNode middle(ListNode head){

            ListNode hare = head;
            ListNode turttle = head;

            while (hare.next != null && hare.next.next != null) {
                hare = hare.next.next;
                turttle = turttle.next;
                
            }

            return turttle;

        }
     

        // Check if a Linked List is a palindrome ==> try to solve it by own

        public boolean isPalindrome(ListNode head) {
            if(head == null || head.next == null){
                return true;
            }

            ListNode middle = middle(head);
            ListNode reverse = reverseList(middle.next);

            ListNode first = head;

            while (reverse != null) {
                if(first.val != reverse.val){
                    return false;
                }
                first = first.next;
                reverse = reverse.next;
                
            }
          return true;
        }

        // Detecting Loop in a Linked List.  ==  



        // 
        public boolean hasCycle(ListNode head) {
            return true;
        }

        // remove all the duplicates number from a sorted linked list which can appears once

        public ListNode deleteDuplicatesOne(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode previous = head;
            ListNode current  = head.next;
            while (current != null) {

                if(previous.val == current.val){
                    previous.next = current.next;
                  
                }else{
                    previous = current;
                }
                
                current = current.next;
                
            }
           return head;
        }

        // remove all the duplicates number from a sorted linked list which can appears tiwce
        public ListNode deleteDuplicates(ListNode head) {
            return head;
        }

        // selection sort of a lined list
        public ListNode selectionsort(ListNode x){
            if(x == null){
                return x;
            }

            ListNode current = x;
            while (current != null) {

                ListNode min = current;
                ListNode nexNode = current.next;

                while (nexNode !=null) {

                    if(min.val > nexNode.val){
                        min = nexNode;
                    }

                    nexNode = nexNode.next;
                    
                }

                if(min != current){
                    int tem = current.val;
                    current.val = min.val;
                    min.val = tem;
                }


                current = current.next;
                
            }
            return x;
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null && list2 == null) {
                return null;
            }
            if(list1 == null){
                return list1;
            }
            if(list2 == null){
                return list2;
            }
            ListNode pre = list1;
            ListNode curr = pre.next;
            while (curr != null) {
                pre = pre.next;
                curr = curr.next;
                
            }
            pre.next = list2;

            ListNode s = selectionsort(list1);
        
           return s;
        }

        public ListNode removeElements(ListNode head, int val) {
            while (head != null && head.val == val) {
                head = head.next;
                
            }
            ListNode pre = head;
            ListNode curr = head.next;
            while (curr != null) {
                
                if(curr.val == val){
                    pre.next = curr.next;
                    curr = curr.next;
                }else{
                    pre = curr;
                    curr = curr.next;
                }
                
            }
            return head;
        }

        public int size(ListNode x){
            int size = 0;
            while (x != null) {
                size++;
                x = x.next;
                
            }
            return size;
        }

        // Rotate a list
        // this code has issue in large k value , need to solve it for submission;
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null){
                return head;
            }
            int size = size(head);
            int reminder = k % size;
            while (reminder > 0) {
                ListNode pre = head;
                ListNode cru = head.next;
                while (cru.next != null) {
                    pre = pre.next;
                    cru = cru.next;
                }
                ListNode tem = cru;
                pre.next = null;
                tem.next = head;
                head = tem;
                reminder--;
                
            }
          return head;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode listOne = reverseList(l1);
            ListNode listTwo = reverseList(l2);
            int resOne = 0;
            int resTwo = 0;

            while (listOne != null) {
                resOne = resOne*10 + listOne.val;
                listOne = listOne.next;
            }

            while (listTwo != null) {
                resTwo = resTwo*10 + listTwo.val;
                listTwo = listTwo.next;
                
            }
            int result = resOne + resTwo;

          

            

            while (result > 0) {

                int val = result % 10;

               
              addLast(val);

                 
                result = result/10;
                
            }

        return head;
        }
        ListNode head;
        public void addLast(int data) {
            ListNode x = new ListNode(data);
        if (head == null) {
            head = x;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = x;
        }

       


    public static void main(String[] args) {
      
    }
    
}
