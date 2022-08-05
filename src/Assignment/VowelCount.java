package Assignment;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class VowelCount {
    private static int vowelCount(String str) {
        if (str.length() == 0 || str == null) {
            return 0;
        } else if (str.charAt(0) == 'a' ||
                str.charAt(0) == 'i' ||
                str.charAt(0) == 'e' ||
                str.charAt(0) == 'o'||
                str.charAt(0) == 'u') {
            return 1 + vowelCount(str.substring(1));
        } else {
            return vowelCount(str.substring(1));
        }

    }

    public static void main(String[] args) {

//        Queue<Integer> ferita = new PriorityQueue<>();
//        Queue<Integer> num = new LinkedList<>();
//
//        ferita.offer(12);
//        ferita.offer(3);
//        ferita.offer(1);
//        ferita.offer(234);
//
//        System.out.println(ferita);
//        System.out.println("#####");
//        num.offer(12);
//        num.offer(3);
//        num.offer(1);
//        num.offer(234);
//        System.out.println(num);

        //reve(100);
       int [] arr ={1,2,2,3,4};
        int [] amx = {1,2,3,4,5};
        System.out.println("Arr: "+dup(amx));
        //System.out.println(dup(amx,0,0));

    }
    public static void reve(int n){
        int div = n%10;
        if(n==0)
            return;
        System.out.print(div);
        reve(n/10);
    }
    static int i=0;
    public static boolean dup(int [] arr){


        boolean isDup=false;

        int j= arr.length;

        if(i== arr.length) {
            return false;
        }

        if(arr[i++]==arr[--j]) {
            isDup = true;
        }
        else {

            return dup(arr);
        }

        return isDup;
    }
}
