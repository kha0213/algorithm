package com.ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] sequence = new int[N];
		for(int i=0;i<N;i++) {
			sequence[i]=sc.nextInt();
		}
		int answer=0;
		int cnt=1;
		int temp=0;
		for(int i=0;i<N;i++) {
			temp = sequence[i];
			cnt = 1;
			for(int j=i+1;j<N;j++) {
				if(temp>sequence[j]) {
					temp=sequence[j];
					cnt++;
				}
			}
			answer = Math.max(answer, cnt);
			System.out.println(answer+","+i);
		}
		
		
		sc.close();
	}
}
