import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an eight-digit number : ");
        int number = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        while (number != 0){
            int digit = number % 10;
            if (digit % 2 == 0){
                sumEven = sumEven + digit;
            }
            else {
                sumOdd = sumOdd + digit;
            }
            number = number/10;
        }
        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);
    }
}
