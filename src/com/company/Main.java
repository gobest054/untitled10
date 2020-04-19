package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array_int = new int[n];
        for (int i = 0; i < n; i++) {
            array_int[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if(array_int[i]>array_int[j])
                {
                    int swap=array_int[i];
                    array_int[i]=array_int[j];
                    array_int[j]=swap;
                }

            }
        }
        for (int a : array_int)
        {
            System.out.print(a+" ");
        }
    }
}
