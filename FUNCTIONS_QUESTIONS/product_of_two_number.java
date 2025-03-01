import java.util.Scanner;

public class product_of_two_number {
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number to perform sum using function");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println("Sum of two number = " + sum(a,b));
    }
}