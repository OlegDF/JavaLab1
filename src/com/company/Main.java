package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting project");
        byte v_byte=120;
        short v_short=129;
        char v_char='a';
        int v_int=65999;
        long v_long=4294967296L;
        float v_float=0.33333334f;
        double v_double=0.3333333333333333;
        boolean v_boolean=true;
        System.out.println();
        System.out.println("Byte: " + v_byte);
        System.out.println("Short: " + v_short);
        System.out.println("Char: " + v_char);
        System.out.println("Int: " + v_int);
        System.out.println("Long: " + v_long);
        System.out.println("Float: " + v_float);
        System.out.println("Double: " + v_double);
        System.out.println("Boolean: " + v_boolean);
        System.out.println();
        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println();
        long begin = new java.util.Date().getTime();
        for(int i = 0; i < 100000000; i++) {}
        long end = new java.util.Date().getTime();
        System.out.println();
        System.out.println("Runtime with int i: " + (end-begin));
        begin = new java.util.Date().getTime();
        for(long i = 0; i < 100000000; i++) {}
        end = new java.util.Date().getTime();
        System.out.println("Runtime with long i: " + (end-begin));
        int[] mas = {12,43,12,-65,778,123,32,76};
        int max = Integer.MIN_VALUE;
        for(int i: mas) {
            max = Integer.max(max, i);
        }
        System.out.println();
        System.out.println("The greatest number in the array is " + max);
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int)Math.round(Math.random()*10);
            }
        }
        System.out.println();
        System.out.println("Matrix before transposition:");
        for(int i = 0; i < matrix.length; i++) {
            System.out.println();
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int swap = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = swap;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Matrix after transposition:");
        for(int i = 0; i < matrix.length; i++) {
            System.out.println();
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

}
