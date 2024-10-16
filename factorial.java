import java.util.*;
public class factorial {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to factorial : ");
        int a = sc.nextInt();
        int factorial =1;
        for (int i=1;i<=a;i++){
            factorial =factorial*i;

        }System.out.println(factorial);

    }
}
