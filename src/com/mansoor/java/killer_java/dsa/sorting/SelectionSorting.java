package com.mansoor.java.killer_java.dsa.sorting;

import java.util.Arrays;

public class SelectionSorting {

            public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
        public static void main(String[] args) {
            int arr []={2,5,7,1,9,10};
        for (int i = 0; i < arr.length-1; i++) {
            int smallest =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                   smallest=j;
                }
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
        }
        printArray(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
