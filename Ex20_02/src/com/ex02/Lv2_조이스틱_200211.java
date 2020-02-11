package com.ex02;

public class Lv2_¡∂¿ÃΩ∫∆Ω_200211 {
	public static void main(String[] args) {
		char a = 'A'; // 65 //78
		char z = 'Z'; // 90

		System.out.println(a + 1 - 1);
		System.out.println(z + 1 - 1);
	}

	public int solution(String name) {
		char[] ch = name.toCharArray();
		int answer = 0;
		int cnt = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A') {
				cnt++;
			} else {
				break;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] <= 78) {
				answer += ch[i] - 65;
			} else {
				answer += 91 - ch[i];
			}
		}

		// BBAAAAB;

		answer -= cnt;

		answer += ch.length - 1;

		return answer;
	}

}
