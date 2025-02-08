import java.util.Scanner;

public class break_exemple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        while(true){//it is not advisable
            System.out.print("Enter a number = ");
            num=sc.nextInt();
            if(num % 10 == 0){
                System.out.println("break statement run succesfully");
                break;
            }
            System.out.println("You enter = " + num);
        }
        sc.close();
    }
}