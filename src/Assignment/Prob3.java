package Assignment;

import java.util.*;

public class Prob3  {


//    @Override
//    public int compare(Admission o1, Admission o2) {
//        return Integer.compare(o1.adno,o2.adno);
//
//    }




    public static void main(String[] args) {
        //Question A
        Queue<Admission> underGrad = new PriorityQueue<>();
        //Question B
        underGrad.add(new Admission(111,"Kidane","123434"));
        underGrad.add(new Admission(121,"Miky","202734"));
        underGrad.add(new Admission(123,"Gemechu","2025734"));
        underGrad.add(new Admission(342,"Gech","202654"));
        underGrad.add(new Admission(321,"Kelifa","20273467"));

        //Question C
        System.out.println(underGrad.peek());

        //Question D
        System.out.println(underGrad.size());

        //Question E
        Iterator<Admission> iterator=underGrad.iterator();
        while (iterator.hasNext()){
            System.out.println(underGrad.remove());
        }

        //Question F
        System.out.println(underGrad.isEmpty());


    }


}
