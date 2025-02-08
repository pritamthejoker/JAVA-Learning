import java.util.Scanner;

public class print_sum_of_n_nataral_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.print("Enter an intiger and see magic = ");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        while (counter <= n) {
            sum +=counter;
            counter++;
        }
        System.out.print("Sum of n nataral number = " + sum);
    }
}