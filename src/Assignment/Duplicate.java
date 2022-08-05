package Assignment;

import java.util.HashSet;

public class Duplicate {

    public static void removeDuplicates(String[] a) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
            // Print the elements of LinkedHashSet
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        String [] arr = {"Kidane","Micky","Kidane","Lemmessa","Kib"};
        // Function call
        removeDuplicates(arr);
    }
}
