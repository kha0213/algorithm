package com.ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int temp = sc.nextInt();
			System.out.println(koong(temp));
		}
		sc.close();
	}

	
	private static long koong(int k) {

		if(k<2) return 1;
		else if(k==2) return 2;
		else if(k==3) return 4;
		long[] koo = new long[k+1];
		koo[0] = 1;
		koo[1] = 1;
		koo[2] = 2;
		koo[3] = 4;
		for(int i=4;i<=k;i++) {
			koo[i]=koo[i-1]+koo[i-2]+koo[i-3]+koo[i-4];

		}
		return koo[k];
	}
}


