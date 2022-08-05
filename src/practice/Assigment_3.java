package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assigment_3<E> {
    private static final int INITIAL_CAPACITY =10;
    private E [] arr;
    private int size = 0;
    private int capacity;
    //method
    public Assigment_3(){
        capacity=INITIAL_CAPACITY;
        arr = (E[]) new Object[capacity];
    }
    public void insert(){

        if(size ==capacity){
            reAllocate();
        }

        size++;
    }
    public void add(E item){
        if(size ==capacity){
            reAllocate();
        }
        arr[size]= item;
        size++;

    }
    public void reAllocate(){
            capacity = capacity * 2;
            arr = Arrays.copyOf(arr, capacity);

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
}
