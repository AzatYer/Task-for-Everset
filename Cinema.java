import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    static int rows;
    static int seatsPerRow;
    static char[][] layout;
    static int price =0;
    static int freeSeats;

    public static void main(String[] args) {
        System.out.println("Enter rows number:");
        System.out.print(">\t ");
        rows = scanner.nextInt();
        System.out.println("Enter seats number:");
        System.out.print(">\t ");
        seatsPerRow = scanner.nextInt();
        CinemaArrays();
        displaySeat();
        freeSeats = rows * seatsPerRow;
        while (true) {
            System.out.println("1. Print seats.\n2. Buy a ticket.\n3. Show statistics. \n0. Exit");
            int menu = scanner.nextInt();
            switch(menu) {
                case 1:  displaySeat();
                break;
                case 2:
                PurchaseSeat();
                //displaySeat();
                break;
                case 3:
                    int total = 10 * rows * seatsPerRow;
                    System.out.println("Current income: "+ price + "$");
                    System.out.println("Total income: " + total);
                    System.out.println("Number of free seats: " + freeSeats);
                    System.out.println("Total number of seats: " + rows * seatsPerRow);
                    break;
                case 0:
                    System.out.println("Thank you for choosing us! Bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please enter 1, 2 or 0!");
            }
        }
    }
        /*char moreTicket;
        do {
            PurchaseSeat();
            price = price + 10;
            displaySeat();
            System.out.print("Do you want more ticket? y/n: ");
            moreTicket = scanner.next().charAt(0);

        }
        while (moreTicket == 'y' || moreTicket == 'Y');
        System.out.print("Total price for ticket is "+ price + "! Thank you!");*/

    static void CinemaArrays() {
        layout = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                layout[i][j] = 'S';
            }
        }
    }

    static void displaySeat() {
        System.out.println("Cinema Layout:");
        System.out.print("\t");
        //Нумерация мест по столбцам. layout[0] указывает на первый ряд в массиве, .length количество мест в первом ряду.
        for (int seats = 1; seats <= layout[0].length; seats++) {
            System.out.print(seats + "\t");
        }
        System.out.println();
        // Нумерация по рядам и заполнение мест по рядам.
        for (int i = 0; i < layout.length; i++) {
            System.out.print(i +1  + "\t");
            for (int j = 0; j < layout[i].length; j++) {
                System.out.print(layout[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void PurchaseSeat() {
        System.out.println("Choose row: ");
        int row = scanner.nextInt();
        System.out.println("Choose seat: ");
        int seat = scanner.nextInt();
        System.out.println("Price for ticket is 10$.");
       // freeSeats = totalSeats;
        if (row >=1 && row <= rows && seat >= 1 && seat <= seatsPerRow) {
            if (layout[row-1][seat-1] == 'S') {
                layout[row - 1][seat - 1] = 'B';
                System.out.println("Seat reserved");
                price += 10;
                freeSeats--;
            }
            else
                System.out.println("Seat is already booked.");
            }
        else
            System.out.println("That seat does not exist. Choose valid seat. ");
        }
    }