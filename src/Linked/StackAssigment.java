package Linked;

import java.util.Scanner;
import java.util.Stack;

public class StackAssigment {
    private Stack<String> st;


    public StackAssigment(){
        st = new Stack<>();
    }

    private void fillStack(String input){
        String [] arr = input.split(" ");
        for (String s : arr){
            st.push(s);
        }
    }

    private String printReversed(){
        StringBuilder sb = new StringBuilder();
        while(! st.isEmpty()){
            sb.append(st.pop()+" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StackAssigment r = new StackAssigment();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your input:");
        String input =scanner.nextLine();
        r.fillStack(input);
        System.out.println(r.printReversed());

    }



}
