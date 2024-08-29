import java.util.*;

public class Main {

  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " "); // Changed to print instead of println
      }
      System.out.println();
    }
  }

  static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
    if (r1 != r2 || c1 != c2) {
      System.out.println("Wrong input - Addition not possible");
      return;
    }

    int[][] sum = new int[r1][c1];

    for (int i = 0; i < r1; i++) { // row number
      for (int j = 0; j < c1; j++) { // column number
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    printMatrix(sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int r = sc.nextInt();
    System.out.println("Enter number of columns");
    int c = sc.nextInt();

    int[][] a = new int[r][c]; // First matrix
    System.out.println("Enter " + r * c + " elements for Matrix 1");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    int[][] b = new int[r][c]; // Second matrix
    System.out.println("Enter " + r * c + " elements for Matrix 2");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        b[i][j] = sc.nextInt();
      }
    }

    System.out.println("Matrix 1");
    printMatrix(a);
    System.out.println("Matrix 2");
    printMatrix(b);

    add(a, r, c, b, r, c); // Corrected function call
  }
}
