import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task24();
    }

    public static void Task1() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.printf("%d bigger than %d\n", a, b);
        } else {
            System.out.printf("%d bigger than %d\n", b, a);
        }
    }

    public static void Task2() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum number is " + max);
    }

    public static void Task3() {
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x + " is POSITIVE number");
        } else if (x < 0) {
            System.out.println(x + " is NEGATIVE number");
        } else {
            System.out.println(x + " is equal to ZERO");
        }

    }

    public static void Task4() {
        int x = scanner.nextInt();
        if ((x % 5 == 0) && (x % 11 == 0)) {
            System.out.println(x + " is divisible by 5 and 11");
        } else if (x % 5 == 0) {
            System.out.println(x + " is divisible by 5");
        } else if (x % 11 == 0) {
            System.out.println(x + " is divisible oby 11");
        } else {
            System.out.println(x + " is not divisible by 11 and 5");
        }
    }

    public static void Task5() {
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is odd");
        } else {
            System.out.println(x + " is even");
        }
    }

    public static void Task6() {
        //Write a  program to check whether a year is leap year or not
        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        boolean leap;
        // Leap year is divided by four, but if it is century year, it should be divided by 400.
        // To check it is is century year we divide by 100, if not, leap is true.
        // if yes it proceed further with checking.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void Task7() {
        //Write a program to check whether a character is alphabet or not
        char val = scanner.next().charAt(0);
        System.out.println("Value: " + val);
        if (Character.isAlphabetic(val)) {
            System.out.println(val + " is from Alphabet");
        } else {
            System.out.println(val + " is not from Alphabet");

        }

    }

    public static void Task8() {
        //Write a  program to input any alphabet and check whether it is vowel or consonant
        System.out.println("Input letter lowercase: ");
        char val = scanner.next().charAt(0);
        switch (val) {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println(val + " is vowel");
                break;
            default:
                System.out.println(val + "is consonant");
        }
    }

    public static void Task9() {
        //Write a  program to input any character and check whether it is alphabet, digit or special character
        System.out.println("Enter your value: ");
        char val = scanner.next().charAt(0);
        if (Character.isAlphabetic(val))
            System.out.println("Your value is Alphabetic");
        else if (Character.isDigit(val)) {
            System.out.println("Your value is Digit");
        } else
            System.out.println("Your value is Specific Character");
    }

    public static void Task10() {
        //Write a  program to check whether a character is uppercase or lowercase alphabet
        System.out.println("Enter your letter: ");
        char val = scanner.next().charAt(0);
        if (Character.isUpperCase(val))
            System.out.println("Your letter is Uppercase");
        else
            System.out.println(" Your letter is Lowercase");
    }

    public static void Task11() {
        //Write a  program to input week number and print week day
        System.out.println("Enter the week number from 1 to 7: ");
        int WeekNumber = scanner.nextInt();
        switch (WeekNumber) {
            case 1:
                System.out.println("It is Monday! Good week!");
                break;
            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday! Have a good weekend");
                break;
            case 6:
                System.out.println("It is Saturday! Have a good weekend!");
                break;
            case 7:
                System.out.println("It is Sunday - Fun day!");
                break;
            default:
                System.out.println("Can't you read?");
        }
    }

    public static void Task12() {
//Write a  program to input month number and print month Name
        System.out.println("Enter the month number from 1 to 12: ");
        int Month = scanner.nextInt();
        switch (Month) {
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is February!");
                break;
            case 3:
                System.out.println("It is March!");
                break;
            case 4:
                System.out.println("It is April!");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October!");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
            default:
                System.out.println("Enter from 1 to 12");
        }
    }

    public static void Task13() {
        //Write a  program to count total number of bank notes in given amount.
        // Let there be a maximum bank note of 2000tg.
        // Bank notes: 2000 tg, 1000 tg, 500 tg, 100 tg, 50 tg, 20 tg, 5 tg.
        System.out.println("Enter the amount of money");
        int a = scanner.nextInt();
        int n2000, n1000, n500, n200, n100, n50, n20, n10, n5;
        n2000 = n1000 = n500 = n200 = n100 = n50 = n20 = n10 = n5 = 0;
        if (a >= 2000)
            n2000 = a / 2000;
        a = a - n2000 * 2000;
        if (a >= 1000)
            n1000 = a / 1000;
        a = a - n1000 * 1000;
        if (a >= 500)
            n500 = a / 500;
        a -= n500 * 500;
        n200 = a / 200;
        a -= n200 * 200;
        if (a >= 100)
            n100 = a / 100;
        a -= n100 * 100;
        if (a >= 50)
            n50 = a / 50;
        a -= n50 * 50;
        if (a >= 20)
            n20 = a / 20;
        a -= n20 * 20;
        if (a >= 10)
            n10 = a / 10;
        a -= n10 * 10;
        if (a >= 5)
            n5 = a;
        System.out.println("Total number of Notes: ");
        System.out.println(n2000 + "= 2000 tg");
        System.out.println(n1000 + "= 1000 tg");
        System.out.println(n500 + "= 500 tg");
        System.out.println(n200 + "= 200 tg");
        System.out.println(n100 + "= 100 tg");
        System.out.println(n50 + "= 50 tg");
        System.out.println(n20 + "= 20 tg");
        System.out.println(n10 + "= 10 tg");
        System.out.println(n5 + "= 5 tg");
    }

    public static void Task14() {
        //Write a  program to input angles of a triangle and check whether triangle is valid or not
        System.out.println("Input A, B, C angles of triangle: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int angle = A + B + C;
        if (angle == 180 && A > 0 && B > 0 && C > 0)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is not valid");
    }

    public static void Task15() {
        //Write a  program to input all sides of a triangle and check whether triangle is valid or not
        System.out.println("Input A, B, C lengths of triangle: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A + B > C && B + C > A && A + C > B)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is not valid");
    }

    public static void Task16() {
        //Write a  program to check whether the triangle is equilateral, isosceles or scalene triangle
        System.out.println("Input A, B, C lengths of triangle: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A + B > C && B + C > A && A + C > B) {
            if (B == C && C == A)
                System.out.print("Triangle is equilateral");
            else if (B == C || B == A || A == C)
                System.out.print("Triangle is isosceles");
            else
                System.out.println("Triangle is scalene");
        } else
            System.out.println("Triangle is not valid");
    }

    public static void Task17() {
        //Write a  program to find all roots of a quadratic equation
        // root1,2 = (-b +- sqrt(b2-4ac))/2a
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1, root2;
        if (discriminant > 0) {
            root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));

            System.out.printf("root1 = %.2f root2 = %.2f", root1, root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.printf("root1 = root2 = %.2f", root1);
        } else {
            double i = Math.sqrt(-discriminant) / (2 * a);
            double real = -b / (2 * a);
            System.out.printf("root1 = %.2f + %.2fi", real, i);
            System.out.printf("\nroot2 = %.2f - %.2fi", real, i);
        }

    }

    public static void Task18() {
        System.out.println("Enter the cost price");
        double cost = scanner.nextDouble();
        System.out.println("Enter the selling price");
        double sell = scanner.nextDouble();
        double diff = sell - cost;
        if (diff > 0) {
            System.out.println("Great, your profit is " + diff + "$");
        } else if (diff == 0)
            System.out.println("No profit, no loss");
        else {
            System.out.println("Ooops, your loss is " + diff + "$");
        }
    }

    public static void Task19() {
        System.out.println("Enter your grades");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int m5 = scanner.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double grade = total / 5;
        System.out.println("Your average percentage: " + grade);
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else if (grade >= 40) {
            System.out.println("Grade: E");
        } else
            System.out.println("Grade: F");
    }

    public static void Task22() {
        //while purchasing certain items, a discount of 10% is offered
        //if the quantity purchased is more than 100. If quantity and price per
        //item are input through the keyboard, write a program to calculate the
        //total expenses
        System.out.println("Price");
        int price = scanner.nextInt();
        System.out.println("Quantity");
        float quantity = scanner.nextFloat();
        float total = price * quantity;
        if (quantity < 100) {
            System.out.println("Total price: " + total);
        } else {
            total = total * 0.9f;
            System.out.println("Total price: " + total);
        }
    }
    public static void Task23() {
        System.out.println("Current year");
        int now = scanner.nextInt();
        System.out.println("Boarding year");
        int then = scanner.nextInt();
        int seniority = now - then;
        if (seniority > 3) {
            System.out.println("You are eligible for bonus of 2500 Rs");
        }
        else {
            System.out.println("No bonus, sorry not sorry");
        }
    }
    public static void Task24() {
        System.out.println("Salary: ");
        float salary = scanner.nextFloat();
        float gross, hra, da;
        if (salary < 1500) {
            hra = 0.1f * salary;
            da = 0.9f * salary;
        }
        else {
            hra = 500;
            da = 0.98f * salary;
        }
        gross = salary + hra + da;
        System.out.println("Gross salary: " + gross);
    }
}
