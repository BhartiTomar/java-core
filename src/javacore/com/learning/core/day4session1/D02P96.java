package javacore.com.learning.core.day4session1;

public class D02P96 {
    private int[] queue;
    private int front, rear, size, capacity;
 
    public D02P96(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = -1;
        size = 0;
    }
 
    public void enqueue(int item) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        queue[rear] = item;
        size++;
    }
 
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return item;
    }
 
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        } while (i != (rear + 1) % capacity);
        System.out.println();
    }
 
    public static void main(String[] args) {
        D02P96 queue = new D02P96(4);
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);
        queue.display();
 
        queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}