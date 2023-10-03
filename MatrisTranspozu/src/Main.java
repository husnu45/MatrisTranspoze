import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin : ");
        int rowCount = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin : ");
        int colCount = scanner.nextInt();

        int[][] matris = new int[rowCount][colCount];

        System.out.print("Matris elemanlarını girin :");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                matris[i][j] = scanner.nextInt();
            }
        }

        int[][] transpozeMatris = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        printMatris(matris);

        System.out.println("Transpoze : ");
        printMatris(transpozeMatris);

        scanner.close();
    }

    public static void printMatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
