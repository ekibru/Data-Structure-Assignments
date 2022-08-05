package practice;

import java.util.*;

public class MyArrayList implements Iterable{
    //Data member
    private static final int INITIAL_CAPACITY =10;
    private String [] arr;
    private int size = 0;
    private int capacity;
    //method
    public MyArrayList(){
        capacity=INITIAL_CAPACITY;
        arr = new String[capacity];
    }
    public void add(String item){
        if(size ==capacity){
           reAllocate();
        }
        arr[size]= item;
        size++;

    }
    public void add(int index, String item){
        if(index<0 || index>size)
            throw new ArrayIndexOutOfBoundsException("Wrong Input");
        if(size == capacity){
          reAllocate();
        }

        //shifting the data to the end
        for (int i = size; i>index; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=item;
        size++;
    }
    public String get(int index){
        if(index<0 || index>=size)
            throw new ArrayIndexOutOfBoundsException("Wrong Input");
        return arr[index];
    }
public String set(int index,String itemN){
    if(index<0 || index>=size)
        throw new ArrayIndexOutOfBoundsException("Wrong Input");
        String hand = arr[index];
        arr[index] = itemN;
        return hand;
}
public void reAllocate(){
    System.out.println("do u want add more?");
    Scanner scanner = new Scanner(System.in);
    String answer=scanner.next();
    if(answer.equalsIgnoreCase("yes")) {
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr, capacity);
    }else
        System.out.println("Bye");
}
 public void insert(){
        Random random = new Random();
        int x;
        for(int i =0;i<50;i++){
            x = random.nextInt(100)*10;
        }
    if(size ==capacity){
        reAllocate();
    }
   // arr[size];
    size++;
}
public int size1(){
        return size;
}
    @Override
    public String toString() {
        StringBuilder arb = new StringBuilder("[");
        for (int i = 0; i < size-1; ++i) {
            arb.append(arr[i]+",");
        }
        arb.append(arr[size-1]+"]");
        return arb.toString();
    }

    public static void main(String[] args) {

    }

    @Override
    public Iterator iterator() {
        return null;
    }

}
