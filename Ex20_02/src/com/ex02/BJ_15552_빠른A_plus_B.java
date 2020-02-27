package com.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_15552_빠른A_plus_B {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int T = Integer.parseInt(bf.readLine());
			String[] temp= {"",""};
			int[][] input = new int[T][2];
			for(int i=0;i<T;i++) {
				temp = bf.readLine().split(" ");
				for(int j=0;j<2;j++) {
					input[i][0]=Integer.parseInt(temp[0]);  
					input[i][1]=Integer.parseInt(temp[1]);  
				}
				bw.write(input[i][0]+input[i][1]+"\n");
			}
			bw.flush();
			bw.close();
			bf.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
