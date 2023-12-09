import java.util.Scanner;

public class ReturnType {
   /* public static int printTotal(int num1 , int num2){
        int total = num1 + num2 ;
        return total;
    }*/
   /* public static int findDigitCount(int number) {
       int count = 0;
       while (number!=0){
           number/=10;
           count++;
       }
       return count;
   }*/
   public static int sumOfDigits(int number) {
       int sum = 0;
       while (number!=0){
           sum+=number%10;
           number/=10;
       }
       return sum;
   }
    public static void main(String[] args) {
        /*int x = 10, y = 20 , ttl;
        ttl = printTotal(x , y);
        System.out.println(x+" + "+y+" ="+ ttl );

    }*/

       /* Scanner input = new Scanner(System.in);
        System.out.println(" Input an Integer : ");
        int num = input.nextInt();
        int count = 0;
        count = findDigitCount(num);
        System.out.println(" No of digits ="+ count);*/

        Scanner input = new Scanner(System.in);
        System.out.println(" Input an Integer : ");
        int num = input.nextInt();
        int sum;
        sum = sumOfDigits(num);
        System.out.println("Sum of Digits = "+sum);
    }
}
