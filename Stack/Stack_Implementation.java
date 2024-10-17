package Stack;

public class Stack_Implementation {
    private static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
        
    }



    // stack implementation using LinkedList;
   
    public static class Stack {
        public static Node head = null;
        public static boolean isEmpty(){
            return head == null;

        }

        public static void push(int data){

            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.val;
        }
    
        
    }


    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }


        
        
    }
    
}
