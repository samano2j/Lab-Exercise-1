import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Scanner scan;
        int num = 0;

        scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        num = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scan.close();
    }
}
