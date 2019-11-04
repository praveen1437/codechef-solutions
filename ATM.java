package beginner;

import java.math.BigDecimal;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ATM {

    /* package codechef; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn= new Scanner(System.in);

        double withdraw= scn.nextInt();
        double totalBalance= scn.nextDouble();

        if(withdraw%5==0&&totalBalance>=(withdraw+0.50)){
            System.out.format("%.2f",totalBalance-withdraw-0.50);
        }
        else{
            System.out.format("%.2f",totalBalance);
        }
    }
}


