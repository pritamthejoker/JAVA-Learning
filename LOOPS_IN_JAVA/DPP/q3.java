//in this code we are calculating the factorial of a input number (n)

import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        sc.close();
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial is = " + factorial);
    }
}