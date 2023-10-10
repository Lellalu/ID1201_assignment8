package se.kth.id1201;

public class Queue<T> {
    private Node back;
    private Node front;

    public class Node{
        T item;
        Node next;

        public Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    public Queue(){
        back = null;
        front = null;
    }

    public void add(T item){
        Node newBack = new Node(item, back);
        back = newBack;
        if(front == null){
            front = newBack;
        }
    }

    public T remove(){
        if(front == null){
            return null;
        }

        T item = front.item;
        if(back == front) {
            back = null;
            front = null;
            return item;
        }

        Node node = back;
        while(node.next != front){
            node = node.next;
        }
        node.next = null;
        front = node;
        return item;
    }

    public boolean isEmpty(){
        return front==null && back==null;
    }
    
}
