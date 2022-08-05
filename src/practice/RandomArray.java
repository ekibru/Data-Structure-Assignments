package practice;

import java.util.ArrayList;
import java.util.Random;
/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 3
 */
public class RandomArray<E> {
    ArrayList<E> num;
    int size=0;
    public  ArrayList<Integer> insert(int index){
        ArrayList<Integer>arr = new ArrayList<>();
        Random random = new Random();
        int x =random.nextInt();

        for (int i = 0; i < index; i++) {
            x = random.nextInt(101);
            arr.add(x);

            size++;
        }


        return arr;
        // System.out.println(num);
    }
    public  void removeDuplicate(ArrayList<E>num){
        ArrayList<E> arr = new ArrayList<>();
        for (int i = 0; i < num.size()-1; i++) {
            if(!num.contains(num.get(i))) {
                arr.add(num.get(i));
                size++;
            }
        }
        System.out.println(num);
    }
    public void clear(ArrayList<E>num){
        for (int i=0; i<num.size();i++){
            num.clear();
        }
        System.out.println(num);

    }
    public  int size(){
        return size;
    }
    public ArrayList<E> getsubListElements(int k,int j) {
        ArrayList<E>arr = new ArrayList<>();
        for (int i = k,z=0; i <= j; i++,z++) {
            arr.add(num.get(i));
        }
        return  arr;
    }

}

