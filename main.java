import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.next().charAt(0);
        char SecondChar = scanner.next().charAt(0);
        int sum = (int)firstChar + (int)SecondChar;
        char newChar = (char)sum;
        System.out.println(sum);
        System.out.println(newChar);
    }
}
