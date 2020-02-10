package com.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_11399_ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] person = new int[N];
		for (int i = 0; i < N; i++) {
			person[i] = sc.nextInt();
		}
		Arrays.sort(person);
		
		
		int sum = 0;
		int sumPer = 0;
		for(int i=0;i<N;i++) {
			sumPer+=person[i];
			sum+=sumPer;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
