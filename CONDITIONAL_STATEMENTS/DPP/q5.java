import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if(year%4 != 0){
            System.out.println("This year is not a leep year");
        }
        else if(year%100 != 0){
            System.out.println("Thir year is a leep year");
        }
        else if(year%400 == 0){
            System.out.println("This year is a leep year");
        }
        else{
            System.out.println("This year is not a leep year");
        }
    }
}