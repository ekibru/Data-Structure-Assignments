package Linked;

import java.util.Stack;

public class Stackprac {
    public static void main(String[] args) {

        // {, }, (, ), [, ] are the only symbols considered for the check
        String str = "{}()[]";

        if (isBalanced(str))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char removed;
            switch (c) {
                case ')':
                    removed = stack.pop();
                    if (removed == '{' || removed == '[')
                        return false;
                    break;

                case '}':
                    removed = stack.pop();
                    if (removed == '(' || removed == '[')
                        return false;
                    break;

                case ']':
                    removed = stack.pop();
                    if (removed == '(' || removed == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

}
