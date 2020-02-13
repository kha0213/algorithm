package com.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bj_1931_회의실배정 {
	 public static void main(String[] args) {
	        try {

	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            int N = Integer.parseInt(br.readLine());
	            int[][] conference = new int[N][2];

	            StringTokenizer st = null;
	            for (int i = 0; i < N; i++) {
	                st = new StringTokenizer(br.readLine());

	                for (int j = 0; j < 2; j++) {
	                    conference[i][j] = Integer.parseInt(st.nextToken());
	                }
	            }

	            Arrays.sort(conference, new Comparator<int[]>() {

	                @Override
	                public int compare(int[] o1, int[] o2) {
	                    if(o1[1]==o2[1]) {
	                    	return o1[0]-o2[0];
	                    }
	                    
	                    return o1[1] - o2[1];
	                }
	            });
	            int cnt = 1;
	            int temp = conference[0][1];
	            for (int i = 1; i < N; i++) {
	                if (conference[i][0] < temp) {

	                } else {
	                    cnt++;
	                    temp = conference[i][1];
	                }
	            }
	            System.out.println(cnt);
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
