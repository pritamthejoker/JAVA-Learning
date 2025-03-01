import java.util.Scanner;

public class binomial {
    public static int factorial(int num){
        int fac = 1;
        for(int i = 1;i <= num;i++){
            fac = fac * i;
        }
        return fac;
    }
    public static int calculate_binomial(int input_n,int input_r){
        int n = factorial(input_n);
        int r = factorial(input_r);
        int n_r = factorial(input_n - input_r);
        int result = n / (r * n_r);
        return result;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r;
        System.out.print("Enter the value of n = ");
        n = sc.nextInt();
        System.out.print("Enter the value of r = ");
        r = sc.nextInt();
        sc.close();

        int result = calculate_binomial(n, r);
        System.out.println("Binomial value is = " + result);
        
    }
}