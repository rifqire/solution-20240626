public class Soal1 {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("OKYES ");
            } else if (i % 4 == 0) {
                System.out.print("YES ");
            } else if (i % 3 == 0) {
                System.out.print("OK ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}