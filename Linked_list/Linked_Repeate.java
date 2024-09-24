package Linked_list;

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
    

    public static void main(String[] args) {
        
    }
}
