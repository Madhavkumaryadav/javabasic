import java.util.Scanner;

public class twodimensionalarray {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of row : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number fo columns : ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter elements for the 2D array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.err.print("Element at [" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("You entered : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

        sc.close();

    }
}
