import java.util.Scanner;

public class lab06 {
    public static void main(String[] args) {
        //leap year
        Scanner input = new Scanner(System.in);
        System.out.println("Which is Leap year ?");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // divisible by 4, not divisible by 100 but also divisible by 400.
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not leap year");
        }

    }
}
