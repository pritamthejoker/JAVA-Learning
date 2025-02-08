import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not = ");
        int num = sc.nextInt();
        sc.close();
        if(num == 2){
            System.out.println("It's a prime number");
        }
        else if(num % 2 == 0){
            System.out.println("Not a prime number");
        }
        else{
            for(int i = 3 ; i <= Math.sqrt(num) ; i++){
                if(num%i == 0){
                    System.out.println("Not a prime number");
                    System.exit(0);
                    break;
                    
                }
                i++;
            }
            System.out.println("It's a prime number");
        }

    }
}