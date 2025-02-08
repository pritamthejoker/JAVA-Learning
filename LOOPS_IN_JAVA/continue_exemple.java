import java.util.Scanner;

public class continue_exemple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To exit enter 0");
        int num = 1;
        while(num != 0){//it is not advisable
            System.out.print("Enter a number = ");
            num=sc.nextInt();
            if(num == 0){
                System.out.println("break statement run succesfully");
                break;
            }
            if(num % 10 == 0){
                System.out.println("continue statement run succesfully");
                continue;
            }
            
            System.out.println("You enter = " + num);
        }
        sc.close();
        
    }
}