import java.util.Scanner;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dataArr = Array.newInstance(String, 2);
        int counter = 0;

        while (input.hasNext()) {
            dataArr[counter] = input.nextLine();
            counter += 1;
        }

        System.out.println(dataArr);
    }
}