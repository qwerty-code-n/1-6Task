//Программа берет на ввод 5 перменных. С этими переменными она выполнит все задания.
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите num : ");
        double num = in.nextDouble();
        System.out.print("Введите num2 : ");
        double num2 = in.nextDouble();
        System.out.print("Введите num3 : ");
        double num3 = in.nextDouble();
        System.out.print("Введите символ для перевода в ASCII: ");
        String a = in.next();
        System.out.print("Task1 - ");
        System.out.println(remainder(num, num2));
        System.out.print("Task2 - ");
        System.out.println(triArea(num, num2));
        System.out.print("Task3 - ");
        System.out.println(animals(num,num2,num3));
        System.out.print("Task4 - ");
        System.out.println(profitableGamble(num,num2,num3));
        System.out.print("Task5 - ");
        operation(num,num2,num3);
        System.out.print("Task6 - Перевод в ASCII - ");
        ctoa(a);
        System.out.print("Task7 - ");
        System.out.println(addUpTo(num));
        System.out.print("Task8 - ");
        System.out.println(nextEdge(num,num2));
        System.out.print("Task9 - ");
        sumOfCubes();
        System.out.print("Task10 - ");
        System.out.println(abcmath(num,num2,num3));
    }

    public static double remainder(double a,double b)
    {
        a = a % b;
        return a;
    }
    public static double triArea(double a, double b)
    {
        a = (a / 2) * b;
        return a;
    }
    public static double animals(double a, double b, double c)
    {
        a = (a * 2) + (b * 4) + (c * 4);
        return a;
    }
    public static boolean profitableGamble(double a, double b, double c)
    {
        if (a *  b > c)
            return true;
        else return false;
    }
    public static void operation(double a, double b, double c)
    {
        if (b + c == a)
            System.out.println("added");
        else if ((b - c == a) | (c - b == a))
            System.out.println("subtracted");
        else if ((b * c == a))
            System.out.println("multiplication");
        else if ((b / c == a) | (c / b == a))
            System.out.println("division");
            else
                System.out.println("None");
    }
    public static void ctoa(String  a)
    {
         char c = a.charAt(0);
         int ascii = (int) c;
         System.out.println(ascii);
    }
    public static double addUpTo(double a)
    {
        double a1 = 0;
        for(int i = 0; i < a + 1 ; i++)
        {
           a1 = a1 + i;
        }
        return a1;
    }
    public static double nextEdge(double a, double b)
    {
        double c = a + b - 1;
        return c;
    }

    public static void sumOfCubes()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива num4 : ");
        int num4 = in.nextInt();
        double c = 0;
        int array[] = new int[num4];
        for (int i = 0; i < num4; i++) {
            array[i] = in.nextInt();
            c = c + array[i]*array[i]*array[i];
        }
        System.out.println(c);
    }

    public static boolean abcmath(double a, double b, double c)
    {
        double a1 = a;
        for(int i = 0; i < b; i++)
        {
            a1 = a1 + a;
        }

        if (a1 % c == 0)
            return true;
        else
            return false;
    }

}
