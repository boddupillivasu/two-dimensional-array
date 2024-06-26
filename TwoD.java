package com.array.java;

import java.util.Arrays;

public class TwoD {
    public static void main(String[] args) {

        // declaration of two dimensional array

        byte [][] twoD = {{1,2,3},{4,5,6},{7,8,9}};
        for ( byte[] two:twoD){
            for (byte element: two){
                System.out.print(element +"");
            }
            System.out.println(" ");
        }

    }
}
