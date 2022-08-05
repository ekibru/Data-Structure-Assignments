import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("J","jane");
        map.put("B","Bill");
        map.put("S","Sam");
        map.put("B1", "Bob");
        map.put("B2","Bill");

//        for (int i=1; i< x.length;i++){
//            if(x[0]==x[i])
//                return true;
//            else
//                r[i-1]=x[i];
//
//        System.out.println(map.get("B1"));
//        System.out.println(map.get("Bill"));
        int x [] = {1,2,3,4,5,5};
        System.out.println(dub1(x));
        System.out.println(hasD(x));

    }
    public static boolean dub1(int [] x){
        if(x.length>1){
            int [] r = new int[x.length-1];
            int i=1;
            while (i!=x.length){
                if(x[0]==x[i])
                return true;
            else
                 r[i-1]=x[i];

            i++;
            }
            return dub1(r);
        }
        return false;
    }
    private static boolean hasD(int [] arr, int i , int j){
        if(j==arr.length)
            return false;
        else if(arr[i]==arr[j])
            return true;
        else
            return hasD(arr,i+1,j+1);
    }
    public static boolean hasD(int [] arr){
        return hasD(arr, 0, 1);
    }
}
