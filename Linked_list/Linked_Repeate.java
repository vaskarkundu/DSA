package Linked_list;

import Linked_list.LinkedList_Question.ListNode;

// addFirst(E e) - Inserts the element at the front of the list.
// addLast(E e) - Inserts the element at the end of the list (same as add()).
// removeFirst() - Removes and returns the first element.
// removeLast() - Removes and returns the last element.
// getFirst() - Returns the first element without removing it.
// getLast() - Returns the last element without removing it.

public class Linked_Repeate {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // add first

    public void addFirst(String data) {
        Node x = new Node(data);
        if (head == null) {
            head = x;
            return;
        }
        x.next = head;
        head = x;

    }

    // add last

    public void addLast(String data) {
        Node x = new Node(data);
        if (head == null) {
            head = x;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = x;
    }
    // remove first

    public void removeFast() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        head.next = head;
    }

    // remove last
    public void removeLast() {
        Node curr = head;
        if (curr == null) {
            System.out.println("Linked List is empty");
            return;
        }
        if (curr.next == null) {
            curr = null;
            return;

        }

        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // print List
    public void printList() {
        Node curr = head;
        if (curr == null) {
            System.out.println("List is empty");
            return;
        }
        while (curr != null) {

            System.out.println(curr.data + "->");
            curr = curr.next;

        }

        System.out.println("NULL");
    }

    // get first element

    public void getFirst() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        System.out.println("first element ->" + head.data);
    }

    // get last elemnt
    public void getLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        if (head.next == null) {
            System.out.println("Last element ->" + head.data);

        }
        while (head.next != null) {
            head = head.next;

        }
        System.out.println("last element ->" + head.data);
    }

    // get size
    public void getSize() {

        int size = 0;
        while (head != null) {
            size++;
            head = head.next;

        }
        System.out.println("size ->" + size);
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node pre = head;
        Node curr = head.next;
        while (curr != null) {
            Node nexNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nexNode;

        }

        head.next = null;
        head = pre;
    }

    public void removeNthFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node h = head;
        int len = 0;
        while (h != null) {
            len++;
            h = h.next;
        }
        int i = 1;
        int n = len - 2;
        if (len == n) {
            head = head.next;
            return;
        }
        Node pre = head;
        Node curr = head.next;
        while (i < n) {
            pre = pre.next;
            curr = curr.next;
            i++;
        }
        pre.next = curr.next;

    }

    public void swapPairs() {

        if (head == null || head.next == null) {
            return;
        }
        Node newHead = head.next;
        Node pre = head;
        Node curr = head.next;
        while (true) {
            Node nexNode = curr.next;
            curr.next = pre;

            if (nexNode == null || nexNode.next == null) {
                pre.next = nexNode;
                break;
            }

            pre.next = nexNode.next;
            pre = nexNode;
            curr = pre.next;
        }
        head = newHead;

    }

    public void isPilindromic() {
        Node oldHead = new Node(head.data);
        Node current = head.next;
        Node temp = oldHead;

        while (current != null) {

            temp.next = new Node(current.data);
            temp = temp.next;
            current = current.next;

        }

        if (head == null || head.next == null) {
            System.out.println(true);
            return;
        }

        Node pre = head;
        Node curr = head.next;
        while (curr != null) {
            Node newNode = curr.next;
            curr.next = pre;
            pre = curr;

            curr = newNode;

        }
        head.next = null;
        head = pre;

        while (oldHead != null && head != null) {

            if (!oldHead.data.equals(head.data)) {
                System.out.println(false);
                return;
            }
            oldHead = oldHead.next;
            head = head.next;

        }

        System.out.println(true);

    }

    public void reverseBetween(int left, int right) {

        if(head == null){
            return;
        }
        
        Node dummy = new Node("0");
        dummy.next = head;
        Node pre = dummy;

        for(int i = 0; i<left - 1; i++){
            pre = pre.next;
        }

        Node current = pre.next;
        Node nexNode = null;
        Node previous = null;

        for(int i =0; i<right - left; i++){
            nexNode = current.next;
            current.next = previous;
            previous = current;
            current = nexNode;

        }

        Node first = pre.next; 
        pre.next = previous;   
        first.next = current;  
        head = dummy.next;

}

    public void deleteDuplicatesOne() {
        if(head == null || head.next == null){
            return;
        }
        Node previous = head;
        Node current = head.next;

        while (current != null) {
            if(previous.data.equals(current.data)){
                previous.next = current.next;
                current = current.next;
            }

            previous = previous.next;
            current = current.next;
        }
    }

    public void deleteDuplicates() {
        if(head == null || head.next == null){
            return;
        }
        //    1,3,4,4,5
        Node first = head;
        Node second = head.next;
        Node thrid = second.next;

        while (thrid != null && thrid.next.next != null) {
            if(second.data.equals(thrid.data)){
                second = thrid.next;
                thrid = second.next;
                first.next = second;
                second.next = thrid;

            }
            first = first.next;
            second = second.next;
            thrid = thrid.next;
            
        }
       
        // Node prNode = head;
        // Node cuNode = head.next;

        // while (cuNode != null && cuNode.next != null) {
            
        //     Node newNode = cuNode.next;
        //     if(prNode.data.equals(cuNode.data) && prNode.data.equals(newNode.data)){
        //         prNode.next = newNode.next;
        //         cuNode = newNode.next;
        //     }
        //     if(prNode.data.equals(cuNode.data)){
        //         prNode.next = cuNode.next;
        //         cuNode = cuNode.next;
        //     }
            
        //     prNode = prNode.next;
        //     cuNode = cuNode.next;
            
        // }

       
        //    return list1;
        }

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

            
        public void mergeTwoLists() {
            ListNode x1 = new ListNode(1);
            x1.next = new ListNode(3);
            x1.next.next = new ListNode(2);
           

            ListNode x2 = new ListNode(4);
            x2.next = new ListNode(6);
            x2.next.next = new ListNode(5);

            ListNode previous = x1;
            ListNode current = x1.next;
            
            while (current != null) {
                current = current.next;
                previous = previous.next;
            }
            previous.next = x2;

            ListNode s = selectionsort(x1);

            while (s != null) {
                System.out.println("s"+s.val);
                s = s.next;
                
            }     
    }


    public void removeElements() {
        
        String x = "1";
        Node pre = head;
        Node curr = head.next;

        while (curr != null) {
            
            if(curr.data.contains(x)){
                pre.next = curr.next;
                curr = curr.next;
            }else{
                pre  = curr;
                curr = curr.next;

            }
           
            
        }
    
    }
    public int checkSize(Node x){
       int size = 0;
       while (x != null) {
          size++;
          x = x.next;
        
       }
       return size;

    }
// Rotate a list
 // Input: head = [1,2,3,4,5],
                                        // k = 2 ==> 4,2,3,1 ==> 
        // Output: [4,5,1,2,3]
        // 5,1,2,3,4

    public void rotateRight() {
        int size = checkSize(head);
        System.out.println(10 % 0);
        int g = 4;
        int k = g % size;
        // System.out.println(k);
        while (k > 0) {
            Node pre = head;
            Node curr = head.next;
            while (curr.next != null) {
                pre = pre.next;
                curr = curr.next;
                
            }
            
            Node tem = curr;
            pre.next = null;
            tem.next = head;
            head = tem;
            k--;
            
        }
        // Input: head = [0,1,2], k = 4
        // Output: [2,0,1]
        
       
          
     
        
    }
    public static void main(String[] args) {
        Linked_Repeate LL = new Linked_Repeate();
      
       
        // LL.addFirst("1");
        LL.addLast("0");
        // LL.addLast("1");
        LL.addLast("1");
        // LL.addLast("2");
        LL.addLast("2");
        // LL.addLast("4");
        // LL.addLast("5");
        // LL.addLast("1");
        // LL.addLast("1");
        // LL.addLast("1");
        // LL.removeElements();
        LL.rotateRight();
        // LL.deleteDuplicates();
        // LL.addLast("7");
        // LL.addLast("8");
        // LL.deleteDuplicatesOne();
        // LL.addLast("4");
        // LL.addLast("5");
        // LL.addLast("6");
        // LL.addLast("7");
        // LL.addLast("8");
        // LL.isPilindromic();
        // LL.addLast("5");
        // LL.removeNthFromEnd();

        // LL.reverseList();
        LL.printList();
        // LL.removeLast();
        // LL.getFirst();
        // LL.getLast();
        // LL.getSize();

    }
}
