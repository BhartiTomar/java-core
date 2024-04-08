package javacore.com.learning.core.day4session1;

public class D02P94 {
    private int front, rear, capacity;
    private int[] queue;
 
    public D02P94(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }
 
    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = item;
    }
 
    public int dequeue() {
        if (front == rear + 1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front++];
        return item;
    }
 
    public void display() {
        if (front == rear + 1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        D02P94 queue = new D02P94(4);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
 
        int removed = queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}