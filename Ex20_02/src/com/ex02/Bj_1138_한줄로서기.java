package com.ex02;


import java.util.Scanner;

public class Bj_1138_한줄로서기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] person = new int[N];
		for(int i=0;i<N;i++) {
			person[i]=sc.nextInt();
		}
		int[] pArr = new int[N];	
		for(int i=0;i<pArr.length;i++) {
			int cnt=0;
			int pNum = person[i];
			for(int j=0;j<pArr.length;j++) {
				if(pNum==cnt && pArr[j]==0) {
					pArr[j]=i+1;
					break;
				}else if(pArr[j]==0) { cnt++;}
			}
		}
		for(int a : pArr) {
			System.out.println(a);
		}
		
		sc.close();
	}
}
