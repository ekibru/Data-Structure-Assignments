package practice;
/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 3
 */
public class TestRandomArray {
    public static void main(String[] args) {
        RandomArray<Integer> num = new RandomArray<>();

        //System.out.println(num.insert(50));
        num.removeDuplicate(num.insert(50));
        num.clear(num.insert(50));
    }
}
