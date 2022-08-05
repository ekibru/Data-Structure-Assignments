package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
    public static void count(ArrayList<String> list) {

        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ephrem");
        list.add("Mickey");
        list.add("Kebede");
        list.add("Tom");
        count(list);
    }
}
