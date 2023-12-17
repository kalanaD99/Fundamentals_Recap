import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arr {
    /*public static void printArray(int[] array){

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("\b\b]");
    }
*/
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        int [] ar = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Input no "+(i+1)+" :");
            ar[i] = input.nextInt();
        }

        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total+=ar[i];
        }
        System.out.println("Total ="+total);*/

        //create an array
     /*   int [] ar = new int [10];
        // add random numbers to the array
        for (int i = 0; i < 10; i++) {
            ar[i] = new Random().nextInt(101);

        }
        // print array
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+", ");
        }
        System.out.println("\b\b]");
        //find total
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
           total+=ar[i];
        }
        System.out.println("total = "+total);
        // max
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if(max<ar[i]){
                max = ar[i];
            }
        }
        System.out.println("max = "+max);
        // min
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(min>ar[i]){
               min = ar[i];
            }
        }
        System.out.println("min = "+min);
*/
        int[] ar = {10,20,30,40,50,60,70,80,90,100};
        //printArray(ar);

        int marks [] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = new Random().nextInt(101);
        }
        int max = 0;
        for (int i = 0; i < marks.length; i++) {
            if (max<marks[i]){
                max = marks[i];
            }
        }
        System.out.println("Max is :"+ max);
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(min>marks[i])
                min = marks[i];
        }
        System.out.println("Min is :" + min);

        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total+=marks[i];
        }
        System.out.println("Total is : "+ total);
        int m = printMarks(marks);
    }

    private static void printMarks(int[] ar) {
        Arrays.sort(ar);
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+", ");
        }
        System.out.println("\b\b]");
    }
}
