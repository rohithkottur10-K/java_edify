package loopstat;

import java.util.Scanner;

public class lops {
    public static void main(String[] args) {

        for (int count = 0; count <= 10; count++) {
            System.out.println(count);
        }

        for (int count = 5; count >= 1; count--) {
            System.out.println(count);
        }
        // while loop//
        int count = 1;
        while (count <= 5) {

            System.out.println(count);
            count++;

        }
        

            ///////////////////////

            int cpin = 1111;
            int epin = 1;
            Scanner input = new Scanner(System.in);
            while (epin != cpin) {
                System.out.println("wrong pin enter again:");
               epin = input.nextInt();
            }
            System.out.println("phone unlocked");
            

            int ct=7;
            do{
                System.out.println(ct);
                ct++;

            }
            while(ct<=7);
            for(int i=1;i<=5;i++){
                if (i==3) {
                    break;
                    
                }
                System.out.println(i);
            }
               
        for(int y=1;y<=10;y++){
            if (y==4) {
                continue;
                
            }
            System.out.println(y);
        }

    }

}
