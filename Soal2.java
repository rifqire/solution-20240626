public class Soal2 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Pattern A");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int currentNum = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum++;
                num++;
            }
            currentNum -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(currentNum + " ");
                currentNum--;
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        int[][] array = new int[n][n];

        int value = 1;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    array[row][col] = value++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    array[row][col] = value++;
                }
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(array[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
