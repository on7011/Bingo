package com.example.aa;

import java.util.ArrayList;
import java.util.List;

public class RandomData {

	List<String> list = new ArrayList<String>();

	// contains

	public String data() {
		String numStr = null;

		for(int i=1; i<=75; i++) {

			numStr = Integer.valueOf((int) (Math.random() * 75) + 1).toString();

			if(list.contains(numStr)) {
				System.out.println(numStr + "は重複しているため再度回す"); //TODO
				continue;
			}else {
				list.add(numStr);
				break;
			}
		}
		System.out.println("> " + numStr);
		return numStr;
	}

	public String listData() {
		return String.join(", ", list);
	}

}
