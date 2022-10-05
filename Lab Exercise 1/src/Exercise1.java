import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Scanner scan;
        int radius = 0;
        double area = 0;

        scan = new Scanner(System.in);
        System.out.println("Input the radius: ");
        radius = scan.nextInt();
        area = Math.pow(radius,2) * Math.PI;

        System.out.println("The radius is: " + radius + " The area is: " + area);

        scan.close();
    }
}
