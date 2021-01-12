package com.hackerrank.patterns.staircase;

public class StairCase {

    public static void stairCase(int n){
        for(int i = n-1; i >= 0 ; i--){
            for(int j = 0; j < n ; j++){
                //System.out.print(" i = "+ i +"  j = "+j);
                if(j >= i)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){

        stairCase(5);

    }
}
