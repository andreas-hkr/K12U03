import java.util.Scanner;

public class Main {
    static boolean magical(int[][] arr) {
        int d1 = 0;
        int d2 = 0;

        for (int i=0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                return false;
            }
            d1 += arr[i][i];
            d2 += arr[i][arr.length-1-i];
        }

        if (d1 != d2) {
            return false;
        }

        for (int i=0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum != d1) {
                return false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            if (sum != d1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Kontrollera om en 2D-array är en magisk fyrkant
        //  - Lika många rader som kolumner
        //  - Summan i varje rad, kolumn, och diagonal är lika

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][4];

        for (int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }

        if (magical(arr)) {
            System.out.println("Magisk");
        } else {
            System.out.println("Inte alls magisk");
        }
    }
}