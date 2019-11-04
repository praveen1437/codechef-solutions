package beginner;

import java.util.Scanner;

public class Factorial {
    /* package codechef; // don't place package name! */




    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scn = new Scanner(System.in);
            int count= scn.nextInt();
            int [] input= new int[count];
            for(int i=0;i<input.length;i++){
              input[i]=scn.nextInt();
            }
            for(int i=0;i<input.length;i++){
                System.out.println(factorial(input[i]));
            }
        }
        public static int factorial(int a){
            if(a==0){
                return 1;
            }
            else{
                return a*factorial(a-1);
            }
        }
    }


