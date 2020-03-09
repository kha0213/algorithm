package com.ex02;

public class Lv1_1차비밀지도 {
	public static void main(String[] args) {
		Lv1_1차비밀지도 lv = new Lv1_1차비밀지도();
		int[] arr1= {9,20,28,18,11};
		int[] arr2= {30,1,21,17,28};
		int n=5;
		String temp1="",temp2="";
		for(int i=0;i<n;i++) {
			
			temp1 = Integer.toBinaryString(arr1[i]);
			int length1 = temp1.length();
			if(temp1.length()<n) {
				for(int k=0;k<n-length1;k++) {
					temp1 = ("0"+temp1);
				}
			}
			temp2 = Integer.toBinaryString(arr2[i]);
			int length2 = temp2.length();
			if(temp2.length()<n) {
				for(int k=0;k<n-length2;k++) {
					temp2 = ("0"+temp2);
				}
			}
	
		}
		
//		System.out.println(lv.solution(5, arr1, arr2));
		

	}
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String temp1="",temp2="";
		for(int i=0;i<n;i++) {
			answer[i]="";
			temp1 = Integer.toBinaryString(arr1[i]);
			int length1 = temp1.length();
			if(temp1.length()<n) {
				for(int k=0;k<n-length1;k++) {
					temp1 = ("0"+temp1);
				}
			}
			temp2 = Integer.toBinaryString(arr2[i]);
			int length2 = temp2.length();
			if(temp2.length()<n) {
				for(int k=0;k<n-length2;k++) {
					temp2 = ("0"+temp2);
				}
			}
			for(int len=0;len<n;len++) {
				if(String.valueOf(temp1.charAt(len)).equals("0") && String.valueOf(temp2.charAt(len)).equals("0") ) {
					answer[i]+=" ";
				}else {
					answer[i]+="#";
				}
			}
			
		}

		return answer;
	}
}
