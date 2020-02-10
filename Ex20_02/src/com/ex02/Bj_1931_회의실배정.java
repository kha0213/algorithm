package com.ex02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bj_1931_회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[][] conference = new int[N][2];
		String[] con = new String[N];
		String[] conTemp=new String[2];
		for (int i = 0; i < N; i++) {
			con[i] = sc.nextLine();
			conTemp = con[i].split(" ");
			conference[i][0] = Integer.parseInt(conTemp[0]);
			conference[i][1] = Integer.parseInt(conTemp[1]);
		}

		Arrays.sort(conference, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]-o2[1];
			}
		});
		
		int cnt=1;
		int temp=conference[0][1];
		for(int i=1;i<N;i++) {
			if(conference[i][0]<temp) {
				continue;
			}else {
				cnt++;
				temp = conference[i][1];
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
