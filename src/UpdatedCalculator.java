import java.util.Scanner;

public class UpdatedCalculator {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum : " + result);
        return a + b;
    }

    static int sub(int a, int b) {
        int result = a - b;
        System.out.println("Sub : " + result);
        return a - b;
    }

    static int mul(int a, int b) {
        int result = a * b;
        System.out.println("Mul : " + result);
        return a * b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Div : " + result);
        return a / b;
    }

    static int exp(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rectangle(int a, int b) {
        System.out.println("Rectangle Perimeter : " + ((a+b)*2));
        System.out.println("Rectangle Area : " + (a*b));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1-Summation\n"
                + "2-Subtraction\n"
                + "3-Multiplication\n"
                + "4-Division\n"
                + "5-Exponential\n"
                + "6-Modding\n"
                + "7-Rectangle Perimeter And Area\n"
                + "0-Quit\n";

        System.out.print(menu);

        while (true) {
            System.out.print("Please Select Transaction : ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("Enter First Number : ");
            int a = input.nextInt();
            System.out.print("Enter Second Number : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    if (div(a, b) == 0) {
                        System.out.println("Second Number Must Be Different From Zero....");
                    }
                    break;
                case 5:
                    System.out.println("Exponent : " + exp(a, b));
                    break;
                case 6:
                    System.out.println("Modding : " + mod(a, b));
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Incorrect Choice..!");
            }
        }

    }
}
