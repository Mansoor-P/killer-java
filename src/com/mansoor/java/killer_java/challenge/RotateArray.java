package com.mansoor.java.killer_java.challenge;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
//        public static void rotate(int arr[],int k){
        int arr[] = {1,2,3,4,5,6,7};
        int k=3;
            if (k>arr.length){
                k=k% arr.length;
            }
            int [] result =new int[arr.length];

            for (int i = 0; i < k ; i++) {
                result [i]=arr[arr.length-k+i];
            }
            int j=0;
            for (int i = k; i < arr.length; i++) {
                result[i]=arr[j];
                j++;
            }
            System.arraycopy(result , 0,arr,0,arr.length);
        System.out.println();
        }


    }


//}
