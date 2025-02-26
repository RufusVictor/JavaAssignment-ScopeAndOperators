import java.util.Scanner;
public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        scanner.close();
        System.out.println("AND: " + (num1 & num2));
        System.out.println("OR: " + (num1 | num2));
        System.out.println("XOR: " + (num1 ^ num2));
        System.out.println("Left Shift (num1 << 1): " + (num1 << 1));
        System.out.println("Right Shift (num1 >> 1): " + (num1 >> 1));
    }
}
