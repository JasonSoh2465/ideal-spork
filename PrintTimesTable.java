import java.util.Scanner;

public class PrintTimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }

        input.close();
    }
}