package com.mansoor.java.dsa.arrays;

import java.util.Scanner;

public class NonRepeatNumber {


        static int unique(int arr[] ){

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        arr[i] = -1;
                        arr[j] = -1;
                    }
                }
            }
            int ans=-1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>0){
                    ans=arr[i];
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Array length");
            int n=sc.nextInt();
            int arr[] =new int [n];
            System.out.println("Enter " + n + " Elements ");
            for (int i = 0; i <n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(unique(arr));
        }
    }

