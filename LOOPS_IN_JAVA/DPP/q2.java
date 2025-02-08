import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int even_sum = 0,odd_sum = 0;
        while(n != 0){
            System.out.println("To exit enter 0");
            System.out.print("Enter a number = ");
            n=sc.nextInt();
            if (n % 2 == 0){
                even_sum += n;
            }
            else{
                odd_sum += n;
            }

        }
        System.out.println("Even sum = " + even_sum + " Odd sum = " + odd_sum);
        sc.close();
    }
}