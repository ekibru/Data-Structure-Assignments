package practice;

import java.util.Collections;
import java.util.*;

/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 3
 */

public class TestStudent {
    public static void main(String[] args) {
        StudentArray student = new StudentArray(5);
        StudentAssignment s1 = new StudentAssignment(111, "Ephrem", 90);
        StudentAssignment s2 = new StudentAssignment(222, "Gemechu", 70);
        StudentAssignment s3 = new StudentAssignment(333, "Mickey", 96);
        StudentAssignment s4 = new StudentAssignment(444, "Dani", 87);
        StudentAssignment s5 = new StudentAssignment(222, "Gech", 70);


        List<StudentAssignment> s = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        Collections.sort(s);
        System.out.println(s);
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s5));


    }
}
