import java.util.Random;

public class Keywords {
    public static void main(String[] args) {
        //break
/*
        while (true){
           */
/* Random r = new Random();
            int x = r.nextInt(101);*//*

           int x = new Random().nextInt(101); // 0 -100
            System.out.println(x);
            if (x == 100)
                break;
        }
        System.out.println("================================================");
        // continue
        System.out.println("Start Main");
        for (int i = 0; i < 10; i++) {
         if (i == 5){
             continue; // skip
         }
            System.out.println(i);
        }
        System.out.println("End Main");
*/

        //return
        System.out.println("Start Main");
        print();
        System.out.println("End Main");



    }
    static  void print(){
        System.out.println("print start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5){
                return;
            }
        }
        System.out.println("print End");
    }
}
