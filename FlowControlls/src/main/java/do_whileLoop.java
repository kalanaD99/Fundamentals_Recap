import java.util.Scanner;

public class do_whileLoop {
    public static void main(String[] args) {
        //eka parak body ek run wela tama condition ek balanne. condition ek true unath nethath body ek run wenaw
        int i=0;
        do {
            System.out.println("doWhile loop "+i);
            i++;
        }while (i<10);


        // to find the no of digits of a input number

        Scanner input = new Scanner(System.in);
        System.out.println("Input a integer :");
        int num = input.nextInt();
        int count = 0;

        do {
            // num = num/100;
            num/=10;
            count++;
        }while (num!= 0);
        System.out.println(" no of digits = "+count);
    }
}
