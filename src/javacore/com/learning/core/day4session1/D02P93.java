package javacore.com.learning.core.day4session1;

import java.util.Stack;

public class D02P93 {
    
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        char[] tokens = expression.toCharArray();

        for (int i = 0; i < tokens.length; i++) {
 
            if (Character.isDigit(tokens[i])) {
                int num = 0;
 
                while (i < tokens.length && Character.isDigit(tokens[i])) {
                    num = num * 10 + (tokens[i] - '0');
                    i++;
                }
                i--;
                stack.push(num);
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
       
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                switch (tokens[i]) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }
    
    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}