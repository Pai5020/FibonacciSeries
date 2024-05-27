import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibonacci f = new fibonacci();

        System.out.println("Enter the position of the Fibonacci value: ");
        int N = sc.nextInt();

        int result = f.fib(N);
        System.out.println("The value is: " + result);
    }
}
