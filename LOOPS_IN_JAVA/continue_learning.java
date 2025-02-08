public class continue_learning {

    public static void main(String[] args) {
        int counter = 0;
        while(counter < 5){
            counter++;
            System.out.print(counter + " ");
            if(counter == 3){
                System.out.print(" continue statement run succesfull  ");
                continue;
            }
        }
    }
}