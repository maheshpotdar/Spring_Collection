package com.mahesh.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List friuts;
	private Set cricketrs;
	private Map countryCapitals;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public void setCountryCapitals(Map countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	public void setCricketrs(Set cricketrs) {
		this.cricketrs = cricketrs;
	}

	public void setFriuts(List friuts) {
		this.friuts = friuts;
	}

	public void displayAllData() {

		System.out.println("***************Information of Fruits List(ArrayList)*********************");

		for (Object o1 : friuts) {
			System.out.println("fruits: " + o1);
		}

		System.out.println("*************Information of Cricketers Set(LinkedHashSet)*******************");
		for (Object o2 : cricketrs) {
			System.out.println("cricketers: " + o2);
		}

		Set set = countryCapitals.entrySet();

		Iterator iterator = set.iterator();

		System.out.println("*************Information of Country -- Capital Map(LinkedHashMap) *******************");
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();

			System.out.println(entry.getKey() + "---" + entry.getValue());
		}

	}
}
