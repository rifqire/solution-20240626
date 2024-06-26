import java.util.ArrayList;
import java.util.Collections;

public class Soal3 {
    public static void main(String[] args) {
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : n) {
            if (num % 3 != 0) {
                list.add(num);
            }
        }

        Collections.sort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
