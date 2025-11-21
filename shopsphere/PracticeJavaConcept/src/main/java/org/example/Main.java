package org.example;
import java.util.Scanner;

public class Main
{

    public static int  add(int a,int b)
    {
        return a+b;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(add(a,b));

    }
}