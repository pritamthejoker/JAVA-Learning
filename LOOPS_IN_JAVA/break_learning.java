public class break_learning {
    public static void main(String[] args) {
        int counter = 0;
        while(true){
            counter++;
            System.out.print(counter + " ");
            if(counter == 5){
                System.out.println("break statement run succesfull");
                break;
            }
        }
    }
    
} 