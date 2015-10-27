package com.ak.practice;

import java.util.Scanner;

class ScannerTest {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //sc.useDelimiter("\\n");
        int x=sc.nextInt();
        double y = sc.nextDouble();
        String s = sc.next();

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
}
}
