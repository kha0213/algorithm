
package com.ex02;

public class Main {
	public static void main(String[] args) {
		Main ne = new Main();
		ne.solution("1D2S#10S");
		

	}
	// s,d,t 1,2,3
	// * 앞것까지 2배 # -
	public int solution(String dartResult) {
	      int answer = 0;
	      char[] dart = dartResult.toCharArray();
	      int[] num= {0,0,0};
	      int cnt = 0;
	      int temp=0;
	      for(int i=0;i<dart.length;i++) {
	    	if(!Character.isDigit(dart[i])) {
	    		num[cnt]=Integer.parseInt(dartResult.substring(temp, i));
	    		temp = i;
	    	}
	    	     	  
	      }
	      System.out.println(""+num[0]+" , "+num[1]+" , "+num[2]);
	      
	      
	      return answer;
	  }
	
	
}


