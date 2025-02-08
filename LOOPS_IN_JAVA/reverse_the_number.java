import java.util.Scanner;

public class reverse_the_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse = ");
        int num = sc.nextInt();
        int rev_num = 0;
        sc.close();
        while(num > 0){
            rev_num = rev_num * 10 + num % 10;
            num /=10;

        }
        System.out.println("Reverse of the number = " + rev_num);
    }
}