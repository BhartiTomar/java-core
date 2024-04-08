package javacore.com.learning.core.day4session1;

class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
public class D02P95 {
    private Node front, rear;
 
    public D02P95() {
        front = rear = null;
    }
 
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
 
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }
 
    public void display() {
        Node current = front;
        System.out.print("Elements in queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        D02P95 queue = new D02P95();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        System.out.println("After removing two elements: ");
        queue.display();
    }
}