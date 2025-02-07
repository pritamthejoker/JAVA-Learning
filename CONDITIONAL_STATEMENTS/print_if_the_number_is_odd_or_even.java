import java.util.Scanner;

public class print_if_the_number_is_odd_or_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to check even or odd = ");
        int a = sc.nextInt();
        sc.close();
        if(a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}