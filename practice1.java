import java.util.*;;

class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");

        int a = sc.nextInt();
        System.out.print("Enter your second number :");

        int b = sc.nextInt();
        int c = a + b;

        System.out.print("Sum of number " + a + " and " + b + " = " + c);

    }
}