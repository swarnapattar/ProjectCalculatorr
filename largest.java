import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Third number: ");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is greater");
        }
    }
}