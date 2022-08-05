package practice;

import java.util.*;

public class ArrayXYZ {
    private static final int IC =5;
    private char [] arr;
    private int size;
    private int cap;

    public ArrayXYZ(){
        cap=IC;
        arr=new char[cap];
    }
    public void reallocate(){

        cap=cap*2;
        arr= Arrays.copyOf(arr,cap);
    }
    public void insert(int index, Character c){
        if(index<0 || index>size)
            throw new IndexOutOfBoundsException();
        if(size==cap)
            reallocate();
        if(size==0)
            arr[size]=c;
        else {
            for (int i = size; i < index; i++) {
                arr[i] = arr[i-1];
            }
        }
        arr[index]=c;
        size++;
    }
    public int size(){
        return size;
    }
   public String toString(){
        StringBuilder sb = new StringBuilder("[");
       for (int i = 0; i < size-1; i++) {
           sb.append(arr[i]+",");
       }

       sb.append(arr[size-1]+"]");
       return sb.toString();
   }

    public static void main(String[] args) {
//        ArrayXYZ arr =new ArrayXYZ();
//        arr.insert(0,'c');
//        arr.insert(1,'b');
//
 //       System.out.println(arr.toString());
        Queue<String> qs = new LinkedList<>();

        qs.offer("John");
        qs.offer("Dave");
        qs.offer("Bob");

        //qs.poll();
        //qs.offer(qs.poll());
        //qs.offer(qs.poll());

        System.out.println(qs);

    }
}
