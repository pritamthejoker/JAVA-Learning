import java.util.Scanner;

public class check_if_the_student_will_pass_or_fail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score = ");
        int score = sc.nextInt();
        sc.close();
        System.out.println((score<33)?"Fail":"Pass");
    }
}