import java.util.Scanner;

public class print_number_1ton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.print("Enter an intiger and see magic = ");
        int n = sc.nextInt();
        sc.close();
        while (counter <= n) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}