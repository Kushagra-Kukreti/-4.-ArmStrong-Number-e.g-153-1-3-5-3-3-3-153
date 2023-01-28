import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arm_strong_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();
        int lcm;
        while (true) {

            System.out.println("enter number to be arm strong number like 153  ");

            int i = scanner.nextInt();
            int o = i, g = 0;

            for (int j = 0; j <= 8; j++) {
                int t = o % 10;

                if (o == 0) {
                    break;
                } else {

                }
                int p = t * t * t;
                g += p;
                o /= 10;

            }
            if (i == g) {
                System.out.println("arm strong number of the given array of numbers : " + g);
            } else {
                System.out.println(
                        "No. It is not an Armstrong No.");
            }

            System.out.println("exit for 1");
            int y = scanner.nextInt();
            if (y == 1) {
                break;
            } else {

            }
            list.clear();

        }

    }
}
