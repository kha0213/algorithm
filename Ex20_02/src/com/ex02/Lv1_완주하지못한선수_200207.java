package com.ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_완주하지못한선수_200207 {
		
	public String solution1(String[] participant, String[] completion) {
        ArrayList<String> pa = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> co = new ArrayList<String>(Arrays.asList(completion));
		pa.sort(null);
		co.sort(null);
		String answer = "";
		int i;
		for(i=0;i<co.size();i++) {
			if(!(pa.get(i).equals(co.get(i)))) {
				return pa.get(i);
			}
		}
		if(i==co.size()) {
			return pa.get(i);
		}
        return answer;
    }
}
