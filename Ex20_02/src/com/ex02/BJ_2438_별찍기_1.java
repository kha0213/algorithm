package com.ex02;

import java.util.Scanner;

public class BJ_2438_별찍기_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
