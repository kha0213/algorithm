package com.ex02;

import java.util.Scanner;

public class Bj_2985_세수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b==c) {
			System.out.println(""+a+"+"+b+"="+c);
		}else if(a-b==c) {
			System.out.println(""+a+"-"+b+"="+c);
		}else if((a*b)==c) {
			System.out.println(""+a+"*"+b+"="+c);
		}else if(a==b*c){
			System.out.println(""+a+"/"+b+"="+c);
		}else if(a==b-c) {
			System.out.println(""+a+"="+b+"-"+c);
		}else {
			System.out.println(""+a+"="+b+"/"+c);
		}
		sc.close();
	}

}
