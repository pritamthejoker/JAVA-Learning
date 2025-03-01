import java.util.Scanner;

public class factorial {
    public static int factoria(int num){
        int fac = 1;
        for(int i = 1;i <= num;i++){
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial = ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + num + " is = " + factoria(num));;
    }
}