import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of A: ");
        int m = sc.nextInt();
        System.out.print("Enter columns of A: ");
        int n = sc.nextInt();
        System.out.print("Enter rows of B: ");
        int p = sc.nextInt();
        System.out.print("Enter columns of B: ");
        int q = sc.nextInt();

        if (n != p) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] A = new int[m][n];
        int[][] B = new int[p][q];
        int[][] C = new int[m][q];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result Matrix C:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
