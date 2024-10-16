import java.util.Scanner;

public class onedimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to in the arry : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter " + size + ": ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

        }
        System.out.println("you entered : ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);

        }
        sc.close();

    }
}