import java.util.Scanner;

public class ternary_operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        sc.close();
        System.out.println((age >= 18)?"Voter":"Not Voter"); //(condition) ? statement1 : statement2;
    }
}