import java.util.Scanner;

public class CodingPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                             /** string palindrome **/

        String str, reverse = "";
        System.out.println("Enter string.....");
        str = sc.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + str.charAt(i);

        if (str.equals(reverse)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("Not a palindrome string");
        }

        /** factorial of a number without recursion **/


        int n;
        int fact = 1;
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of " + n + " is = " + fact);


        /** fibonacci series without using recursion **/

        int a = 0, b = 1, c = 0, fibo_value;
        System.out.println(" \n Enter maximum number limit for print fibonacci series");
        fibo_value = sc.nextInt();
        System.out.print("Printing fibonacci series ");
        System.out.print(a + " " + b);

        for(int i =2; i<fibo_value; i++)
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();

            Prac p1 = new Prac();

        System.out.println("\t \t \t \t \t \t Using Classes ");


                         /** fictorial code **/

            System.out.println("Enter a number");
             p1.a = sc.nextInt();
             p1.fact(a);
             p1.displaySecond();

                        /** fibonacci series code **/

             System.out.println("Enter fibonacci term");
             p1.fi = sc.nextInt();
             p1.display();


            }
        }

class Prac{
      Scanner sc = new Scanner(System.in);

                            /** factorial using recursion **/
          int a;

         int fact(int n)
         {
             if (n == 0 || n == 1) return 1;
              else return fact(n - 1) * n;
         }

         void displaySecond()
         {
             System.out.println("factorial of " + a + " is " + fact(a));
         }

                                   /** fibonacci series using recursion **/
           int fi;

           void display()
           {
               System.out.println("printing fibonacci series using recursion");

               for (int i = 0; i < fi; i++)
                   System.out.print(fibo(i) + " ");
           }

    int fibo ( int n)
    {
        if (n == 0) return 0;

        if (n == 1) return 1;

        else return fibo(n - 1) + fibo(n - 2);
    }



}