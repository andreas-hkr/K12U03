import java.util.Scanner;

public class Main {
    static boolean magical(int[][] arr) {
        // ...
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