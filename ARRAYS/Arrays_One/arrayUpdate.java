public class arrayUpdate {

    public static void main(String[] args) {
        //at first we creat the array and give some value into it
        int pritam[] = new int[5];
        pritam[0] = 1;
        pritam[1] = 2;
        pritam[2] = 3;
        pritam[3] = 4;
        pritam[4] = 5;
        
        //we can update the value of any position of any array exemple = pritam[0]+= 1
        pritam[0]+=1;//in this line we are updateing the value of 0 th position in array
        //for output we are using syso(arrayName[Position])
        System.out.print(" " + pritam[0]);
        System.out.print(" " + pritam[1]);
        System.out.print(" " + pritam[2]);
        System.out.print(" " + pritam[3]);
        System.out.print(" " + pritam[4]);
    }
}