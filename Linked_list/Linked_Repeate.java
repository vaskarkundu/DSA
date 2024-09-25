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

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }

    }

    // add first

    public void addFirst(String data){
        Node x = new Node(data);
        if(head == null){
            head = x;
            return;
        }
        x.next = head;
        head = x;
       


    }

    // add last

    public void addLast(String data){
        Node x = new Node(data);
        if(head == null){
            head =x;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
            
        }
        curr.next = x;
    }
    //  remove first

    public void removeFast(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        head.next = head;
    }

    // remove last
    public void removeLast(){
        Node curr = head;
        if(curr == null){
            System.out.println("Linked List is empty");
            return;
        }
        if(curr.next == null){
            curr = null;
            return;

        }

        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // print List
    public void printList(){
        Node curr = head;
        if(curr == null){
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

    public void getFirst(){
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        System.out.println("first element ->"+head.data);
    }

    // get last elemnt
    public void getLast(){
        if(head == null){
          System.out.println("Linked List is empty");
        }
        if(head.next == null){
            System.out.println("Last element ->"+head.data);

        }
        while (head.next != null) {
             head = head.next;
            
        }
        System.out.println("last element ->"+head.data);
    }

    // get size
    public void getSize(){
        
         int size = 0;
        while (head != null) {
            size++;
            head = head.next;
            
        }
        System.out.println("size ->"+size);
    }

    public void reverseList(){
        if(head == null || head.next == null){
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
    if(head == null || head.next == null){
        head = null;
        return;
    }
    Node h = head;
    int len =0;
    while (h != null) {
        len++;
        h =h.next;
    }
    int i = 1;
    int n = len - 4;
    Node pre = head;
    Node curr = head.next;
    while (i < n) {
        pre = pre.next;
        curr = curr.next;
        i++;
    }
    pre.next = curr.next;
    
    // System.out.println(pre.data);
    // System.out.println(curr.data);


    // return head;
        
}


    public static void main(String[] args) {
        Linked_Repeate LL = new Linked_Repeate();
        LL.addFirst("1");
        LL.addLast("2");
        LL.addLast("3");
        LL.addLast("4");
        LL.addLast("5");
        LL.removeNthFromEnd();
       
        // LL.reverseList();
        LL.printList();
        // LL.removeLast();
        // LL.getFirst();
        // LL.getLast();
        // LL.getSize();
        
    }
}
