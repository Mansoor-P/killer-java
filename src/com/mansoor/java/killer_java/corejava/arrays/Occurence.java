package com.mansoor.java.killer_java.corejava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Occurence {
    static void printarray(){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter element size ");

        int n=sc.nextInt();
        int arr[] =new int [n];

        System.out.println("Enter " + n + " Elements ");

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        printarray();

    }
}
