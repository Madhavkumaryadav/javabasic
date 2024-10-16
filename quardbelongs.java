import java.util.*;

public class quardbelongs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your x-axis element : ");
        int a = sc.nextInt();
        System.out.print("Enter your y-axis element : ");
        int b = sc.nextInt();
        if (a > 0 & b > 0) {
            System.out.print("first quart");
        } else if (a < 0 & b > 0) {
            System.out.print("second quart");
        } else if (a < 0 & b < 0) {
            System.out.print("Third quart ");

        } else if (a > 0 & b < 0) {
            System.out.print("forth quart");
        } else if (a == 0 & b > 0) {
            System.out.print("positive y-axis ");
        } else if (a == 0 & b < 0) {
            System.out.print("Negative y-axis  ");
        } else if (a > 0 & b == 0) {
            System.out.print("positive x-axis : ");
        } else if (a < 0 & b == 0) {
            System.out.print("Negative x-axis : ");
        }

        else {
            System.out.print("origen");

        }

    }

}
