package javacore.com.learning.core.day4session1;

public class D02P91 {
    private int maxSize;
    private String[] stackArray;
    private int top;
 
    public D02P91(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
        return;
    }
 
    public void push(String item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stackArray[++top] = item;
    }
 
    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackArray[top--];
    }
 
    public static void main(String[] args) {
        D02P91 stack = new D02P91(5);
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
 
        System.out.println("After Pushing 4 Elements: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}