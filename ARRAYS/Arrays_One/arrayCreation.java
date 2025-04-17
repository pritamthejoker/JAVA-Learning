public class arrayCreation {

    public static void main(String[] args) {
        //for creating an array we use
        // datatype arrayName[] = new datatype[size];
        int box1[] = new int[5];
        //datatype arrayName[] = {1,2,3,4,5};
        int box2[] = {1,2,3,4,5};
        

        //now we are printing the array in a simple way 
        int counter = 0;
        while(counter < box1.length){
            System.out.print(" " + box1[counter]);
            counter++;
        }
        counter = 0;
        while(counter < box2.length){
            System.out.print(" " + box2[counter]);
            counter++;
        }

        //in first array the output in  0 0 0 0 0 becouse we are not giving any value to the array anymore
    }
}