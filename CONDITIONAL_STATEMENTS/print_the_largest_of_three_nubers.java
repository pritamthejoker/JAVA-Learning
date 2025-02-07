public class print_the_largest_of_three_nubers {

    public static void main(String[] args) {
        int a = 1,b = 3,c = 5;
        if(a>b && a>c){
            System.out.println("a = " + a + " is greater");
        }
        else if(b>c){
            System.out.println("b = " + b + " is greater");
        }
        else{
            System.out.println("c = " + c + " is greater");
        }
    }
}