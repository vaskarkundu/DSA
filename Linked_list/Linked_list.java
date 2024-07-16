package Linked_list;

public class Linked_list {

    Node head;
    
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }
    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }

        Node current = head;
        while(current.next != null){
             current =current.next ;
        }
        current.next = newNode;
        
    }
    public static void main(String[] args) {
        System.out.println("k");
        Linked_list LL = new Linked_list();
    }
}
