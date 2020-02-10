package com.ex02;

import java.util.Scanner;

public class Bj_11047_µ¿Àü0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String NK = sc.nextLine();
		String[] NKArr = NK.split(" ");
		int N = Integer.parseInt(NKArr[0]);
		int K = Integer.parseInt(NKArr[1]);
		Integer[] dongjeon = new Integer[N];
		for (int i = 0; i < N; i++) {
			dongjeon[i] = sc.nextInt();
		}
		int cnt=0;
		int c=dongjeon.length-1;
		while(K!=0) {
			if(K>=dongjeon[c]) {
				cnt++;
				K-=dongjeon[c];
			}else {
				if(c==0) {
					cnt+=K/dongjeon[c];
					break;
				}else {
					c--;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
