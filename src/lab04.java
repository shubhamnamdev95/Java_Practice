import java.util.Scanner;
// swap numbers.
public class lab04 {
    public static void main(String[] args) {
        //swap
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping of numbers");
        System.out.print("Enter value A: ");
        int A = input.nextInt();
        System.out.print("Enter va;ue B: ");
        int B = input.nextInt();

        int C = A;
        A = B;
        B = C;

        System.out.println("Swap Done");
        System.out.println("value of A is:" + A);
        System.out.println("value of B is; " + B);
    }
}
