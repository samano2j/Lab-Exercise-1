import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Scanner scan;
        int cents = 0;
        int dollars = 0;

        scan = new Scanner(System.in);
        System.out.print("Input the cents: ");
        cents = scan.nextInt();

        dollars = cents / 100;
        cents = cents - (dollars * 100);

        System.out.println("The value is " + dollars + " dollars and " + cents + " cents.");

        scan.close();
    }
}
