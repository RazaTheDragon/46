package com.example.faizan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double venom = Math.random();
        int [] sum = new int [10];
        sum [1]=(int)(venom*1000);
        sum [2]=(int)(venom*1000);
        sum [3]=(int)(venom*1000);
        sum [4]=(int)(venom*1000);
        sum [5]=(int)(venom*1000);
        sum [6]=(int)(venom*1000);
        sum [7]=(int)(venom*1000);
        sum [8]=(int)(venom*1000);
        sum [9]=(int)(venom*1000);
        sum [0]=(int)(venom*1000);
        int a = sum[0]+sum[2]+sum[3]+sum[4]+sum[5]+sum[6]+sum[7]+sum[8]+sum[9];
        System.out.println(a);

    }
}
