package practice;

import com.ephrem.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class  Practice_Datastr {
    static int size;
    public static void main(String[] args) {
//        System.out.println(insert(30));
//        System.out.println(size());
//        removeDuplicate(insert(30));
//
//        SingleLinkedList<String> name = new SingleLinkedList<>();
//        grades.addLast("A");
//        grades.addLast("A-");
//        grades.addLast("B");
//        grades.addLast("B+");
//        grades.addLast("A");
//        grades.addLast("B+");
//        System.out.print(grades.findHighGrades());

//        System.out.println("@_@_@_@_@");
       ArrayList<Integer> num = insert(30);

//        System.out.println(num);
//        System.out.println("*******");
//        removeDuplicate(num);
        clear(num);

    }
    //Q A
    public static ArrayList<Integer> insert(int index){
        ArrayList<Integer>num = new ArrayList<>();
        Random random = new Random();
        int x ;
        for (int i = 0; i < index; i++) {
            x = random.nextInt(100) ;
            num.add(x);
            size++;
        }
        return num;
       // System.out.println(num);
    }
    public static void removeDuplicate( ArrayList<Integer> num){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num.size()-1; i++) {
            if(!arr.contains(num.get(i))) {
                arr.add(num.get(i));
                size++;
            }
        }
        System.out.println(arr);
    }
    public static void clear(ArrayList<Integer>rfk){
        for (int i=0; i<rfk.size();i++){
            rfk.clear();
        }
        System.out.println(rfk);

    }
    public static int size(){
        return size;
    }

    
}
