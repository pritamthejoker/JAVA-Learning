import java.util.Scanner;

public class sum_with_input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two number to get sum of it = ");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a+b;
        System.out.print("sum is = " + c);
    }
}