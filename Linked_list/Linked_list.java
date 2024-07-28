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

    // add node in first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }
    //add node in last
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

    // print linked list
    public void printLst(){
        Node current = head;
        if(current == null){
            System.out.println("Linked List is empty");
            return;
        }
        
        while(current != null){
            System.out.print(current.data + "->");
             current =current.next ;
        }
        System.out.println("NUll");
    }

    // remove first element from linked list

    public void firstRemove(){
        Node current = head;
        if(current == null){
            System.out.println("Linked List is empty");
            return;
        }
        head = head.next;
    }

    // remove last element from linked list
    
    public void lastRemove(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
             current = current.next;
        }
        current.next = null;
    }

    // method for removing specific data

    public void removeElement(String data){
        Node currNode = head;
        while (currNode.data == data) {

            currNode = currNode.next;
            
        }
    }

    // size of a linked list
    public void size(){

        Node current = head;
       
        int i = 0;
        while (current != null) {  
           i++;
           current =current.next;
            
        }
       
        System.out.println(i);

        
    }
    public static void main(String[] args) {
        System.out.println("k");
        Linked_list LL = new Linked_list();
        // LL.firstRemove();
        LL.addFirst("I");
        // LL.lastRemove();
        LL.addFirst("Love");
        // LL.lastRemove();
        // LL.addFirst("Programing");
        // LL.addFirst("Programingzzzzzzz");
        // // LL.addLast("done");
        // LL.addLast("doneone");
       
        LL.printLst();
        LL.size();
        
    }
}
