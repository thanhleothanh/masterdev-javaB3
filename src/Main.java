import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] ds1 = {7, 6, 7, 4, 6, 2, 1};
        int[] ds2 = {1, 3, 5, 7, 9};

        TreeSet<Integer> set = new TreeSet<>();
        for (Integer ele : ds1) {
            set.add(ele);
        }
        for (Integer ele : ds2) {
            set.add(ele);
        }
        for (Integer ele : set) {
            System.out.print(ele + ", ");
        }
    }
}
