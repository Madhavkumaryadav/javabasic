public class pattern2 {
    public static void main(String[] args)

    {
        int n = 4;
        int m = 4;
        for (int i = 1; i <= n - i + 1; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == m || j == 1) {
                    System.out.print("*");
                } else {
                    System.err.println(" ");

                }

            }
        }
        System.err.println();

    }
}
