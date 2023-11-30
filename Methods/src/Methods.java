import java.util.Scanner;

public class Methods {
    public static void printData(){
        System.out.println("kalana weerasinghe");
        System.out.println("Panadura");
        System.out.println("24");

    }
    public  static void printDigits(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number :- ");
        int num = input.nextInt();
        int count = 0;

        while (num!=0){
            num/=10;
            count++;
            System.out.println("digits :"+ num+" "+ count);
        }
        System.out.println("digits :"+ count);

    }
    public static void main(String[] args) {
       printDigits();
    }
}
