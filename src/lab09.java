import java.util.Scanner;

public class lab09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest Number");
        System.out.print("Print A Number");
        int A = input.nextInt();
        System.out.print("Print B number");
        int B = input.nextInt();
        System.out.print("Print C Number");
        int C = input.nextInt();
        int greatest;
        if (A >= B && A >= C) {
            greatest = A;
        } else if (B >= A && B >= C) {
            greatest = B;
        } else {
            greatest = C;

            System.out.println("greatest number is: " + greatest);
        }
    }
}
