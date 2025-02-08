public class print_reverse_of_a_number {

    public static void main(String[] args) {
        
        System.out.println("Enter a number to reverse = ");
        int num = 3445;
        System.out.println("The number is = 3445");
        
        while(num > 0){
            System.out.print(num%10);
            num /= 10;
        }
        
    }
}