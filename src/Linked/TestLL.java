package Linked;

import java.util.*;

/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 4 & 5
 */

public class TestLL {
    public static void main(String[] args) {
        SinglyLinkedList num = new SinglyLinkedList();
        num.add(1200);
        num.add(1100);
        num.add(1);
        num.add(222);
        //num.find(11);
       // System.out.println(num.max());
        //System.out.println(num.min());

        Map<Integer,String> map = new HashMap<>();
        map.put(111,"ephrem");
        map.put(112,"ephrwest");
        map.put(113,"Maryland");
        map.put(114,"Virginia");
        map.put(115,"DC");
        map.put(116,"Texas");
        map.put(117,"Silver");
        map.put(118,"Spring");
        map.put(null,"unkown");

    //System.out.println(map.get(111).substring(1));
        //System.out.println(map.get(null));
        Set<Integer> tn = new LinkedHashSet<>();
        tn.add(12);
        tn.add(13);
        tn.add(14);
        tn.add(15);
        tn.add(16);
        tn.add(17);

        //rec(10);
        ran();
        //System.out.println(tn);

    }
    public static void rec(int n){
        if(n==-1)
            return;
        System.out.print(n+" ");
        rec(n-1);
    }
    public static  void ran(){

        int max =0;
        Queue<Integer> q = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            q.offer(x);
        }
        System.out.println("Your Queue: "+q);
        int [] x = new int[q.size()];
       int min=0 ;
        for (int i = 0; i < x.length; i++) {
            x[i] =q.poll();
            min=x[0];
            for (int j = 0; j < x.length; j++) {
                if(x[i]<min)
                    min=x[i];
                if(x[i]>max)
                    max =x[i];
            }

        }
        System.out.println("Your Array: "+Arrays.toString(x));
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
    }
}
