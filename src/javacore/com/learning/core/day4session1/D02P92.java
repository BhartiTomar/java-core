package javacore.com.learning.core.day4session1;

class Node {
    double data;
    Node next;
 
    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}
 
public class D02P92 {
    private Node top;
 
    public D02P92() {
this.top = null;
    }
 
    public void push(double item) {
        Node newNode = new Node(item);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
 
    public double pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Double.NaN;
        } else {
            double poppedItem = top.data;
            top = top.next;
            return poppedItem;
        }
    }
 
    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        D02P92 stack = new D02P92();
        double[] input = {10.0, 20.0, 30.0, 40.0};
 
        for (double item : input) {
            stack.push(item);
        }
 
        stack.display();
 
        System.out.print("After popping twice: ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.println("null");
    }
}
 