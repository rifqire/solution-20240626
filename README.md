# Solution 2024-06-26

### Soal 1

```java
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
```

### Soal 2A, 2B, 2C & 2D

```java
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

```

### Soal 3

```java
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
```

### Soal 4A

Data barang dengan harga lebih besar dari 10000 diurut berdasarkan harga satuan:

```sql
SELECT * FROM Barang
WHERE HARGA_SATUAN > 10000
ORDER BY HARGA_SATUAN;
```

### Soal 4B

Data pelanggan yang namanya mengandung huruf "g" dengan alamat "BANDUNG":

```sql
SELECT * FROM Pelanggan
WHERE NAMA LIKE '%g%' AND ALAMAT = 'BANDUNG';
```

### Soal 4C

Data seluruh transaksi:

```sql
SELECT t.KODE, t.TANGGAL, p.NAMA AS 'NAMA PELANGGAN', b.NAMA AS 'NAMA BARANG', t.JUMLAH_BARANG AS JUMLAH, b.HARGA_SATUAN AS 'HARGA SATUAN', 
(t.JUMLAH_BARANG * b.HARGA_SATUAN) AS TOTAL
FROM Transaksi t
JOIN Pelanggan p ON t.KODE_PELANGGAN = p.KODE
JOIN Barang b ON t.KODE_BARANG = b.KODE;
```

### Soal 4D

Data rekap nama, jumlah, dan total harga pembelian:

```sql
SELECT p.NAMA AS 'NAMA PELANGGAN', SUM(t.JUMLAH_BARANG) AS JUMLAH, 
SUM(t.JUMLAH_BARANG * b.HARGA_SATUAN) AS 'TOTAL HARGA'
FROM Transaksi t
JOIN Pelanggan p ON t.KODE_PELANGGAN = p.KODE
JOIN Barang b ON t.KODE_BARANG = b.KODE
GROUP BY p.NAMA;
```
