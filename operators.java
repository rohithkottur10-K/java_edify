class operators {
    public static void main( String [] args){

        // arithimethic operators ( (+ - * / %) //

        int num1= 40;
        int num2= 30;
        
        System.out.println("sum of the num1 and num2 is " +(num1+num2));
        System.out.println("difference of the num1 and num2 is " +(num1-num2));
        System.out.println("multiplication of the num1 and num2 is " +(num1*num2));
        System.out.println("devision of the num1 and num2 is " +(num1/num2));
        System.out.println("modulus of the num1 and num2 is " +(num1%num2));


        // increment decrement optrs (++ --) //

        int count= 1;
        count++;
        System.out.println(count);

        int ncount=4;
        ncount--;
        System.out.println(ncount);

         // compound assinment operators (+= -= *= %= ) //

         int x=10; // normal form //
         x= x+5;
         System.out.println(x);

         int y=10; // with compound assignment oprts //
         y+=5;
         System.out.println(y); // here y converted into 15 due to above operation //

         y*=5;
         System.out.println(y);

      // relational / comparison operators  (== != < > >= <=) //

      int n1 = 10;
      int n2= 5;

      System.out.println(n1==n2);
      System.out.println(n1!=n2);
      System.out.println(n1>n2);
      System.out.println(n1<n2);

      // logical operators (&& || !) //

         int a=10;
         int b= 5;
         int c=3;
         int d=2;
         System.out.println("logical operators ");
         System.out.println(a>b && c<d); // T && F = F 
         System.out.println(a>b && c>d); // T && T = T

         System.out.println(a>b || c<d); // T || F = T
         System.out.println(a<b || c<d); // F || F = F

         System.out.println("========= negates =======");
         boolean result= a>b;
         System.out.println(result);
         System.out.println( ! result);




        

    }
}