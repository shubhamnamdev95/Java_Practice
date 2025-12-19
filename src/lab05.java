import java.util.Scanner;
// odd even number
public class lab05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print odd even number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        }
            else {
                System.out.println("Odd Number");
            }
        }
    }
