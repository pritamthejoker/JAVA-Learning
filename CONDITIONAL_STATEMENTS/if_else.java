import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        sc.close(); //close the sc becouse we are not taking any input after this line in this code.
        if(age >= 18){
            System.out.println("You are a voter");
        }
        else{
            System.out.println("You are not a voter");
        }

  }
}