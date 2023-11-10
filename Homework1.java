import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Task10();
    }

    public static void Task1() {
        System.out.println("Hello");
        System.out.println("Azat Yerkinova");
    }

    public static void Task2() {
        int a = 74;
        int b = 36;
        System.out.println(a + b);
    }

    public static void Task3() {
        int a = 50;
        int b = 3;
        System.out.println(a / b);
    }

    public static void Task4() {
        int a = 8 * 6 - 5;
        int b = (55 + 9) % 9; // modulus that shows the remainder after division, if x % y is zero, then x is divisible by y.
        int c = 20 + (-3) * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void Task5() {
        int a = 25;
        int b = 5;
        int sum = a * b;
        System.out.println(a + "*" + b + "=" + sum);
    }
    public static void Task6() {
        int a = 125;
        int b = 24;
        int multi = a*b;
        int division = a/b;
        int modulus = a%b;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.println(a + " * " + b + " = " + multi);
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(a + " % " + b + " = " + modulus);
    }
    public static void Task7() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d\n", num, i, num * i); // \n shows results in different lines
        }

    }
    public static void Task8() {
        System.out.println("   J    A   V     V  A");
        System.out.println("   J   A A   V   V  A A");
        System.out.println("J  J  AAAAA   V V  AAAAA");
        System.out.println("JJ   A     A   V  A     A");
    }
    public static void Task9() {
        double a = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println(a);
    }
    public static void Task10() {
        double a = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(a);
    }
}
