package com.hackerrank.array;

public class MinMaxSum {

    static void minMaxSum(int[] arr){
        long minSum = 0, maxSum = 0;

        for(int i = 0 ; i < arr.length; i++){
            long sum = 0;
            for(int j =0 ; j < arr.length; j++){
                if(j != i){
                    sum = sum + arr[j];
                }
            }
            if(sum < minSum || minSum == 0)
                minSum = sum;

            if(sum > maxSum)
                maxSum = sum;
        }

        System.out.print(minSum + " " + maxSum);
    }

    public static void main(String[] args){
        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = i+10;
        }

        minMaxSum(arr);

    }
}
