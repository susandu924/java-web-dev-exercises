package exercises;
import java.util.ArrayList;

public class SumOfEvens {

    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();

        students.add(1);
        students.add(1);
        students.add(2);
        students.add(3);
        students.add(5);
        students.add(8);
        students.add(10);
        students.add(18);
        students.add(22);
        students.add(27);

        System.out.println(students);

    }
        public static int sumEven (ArrayList < Integer > arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
















//    public static void main(String[] args)
////    public static int sumEvens(ArrayList<Integer> arr)
//    {
//        int[] integerArray = {1, 1, 2, 3, 5, 8, 10, 18, 22, 27};
//        int total = 0;
//        for (int i : integerArray) {
//            if (i % 2 == 0) {
//                total += i;
//
//            }
//            return total;
//        }
//
////                System.out.println(i);


}