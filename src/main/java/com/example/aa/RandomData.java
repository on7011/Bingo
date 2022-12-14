package com.example.aa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomData {
	
	

//	List<String> list = new ArrayList<String>();
//
//	// contains
//
	
	static List<String> afterList = new ArrayList<String>();
	
	public String data() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 75; i++) {
			list.add(i);

		}
		
		Collections.shuffle(list);

		String a = null;
		for (int i = 0; i <= 74; i++) {
			a = Integer.valueOf(list.get(i)).toString();
			
			if(afterList.contains(a)) {
				System.out.println("重複"+a);
				continue;
			}else {
				System.out.println(a);
				afterList.add(a);
				break;
			}
		}

		return Integer.valueOf(a).toString();
	}

	public String listData() {
		return String.join(", ", afterList);
	
	}

}
