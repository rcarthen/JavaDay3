package com.ruth.search;

public class Search {

	String[] fruitsArray = new String[] { "apple", "cherry", "berry", "pineapple", "grape", "grapefruit", "mango",
			"mandarin", "blueberry", "strawberry" };

	public String searchValue(String searchValue) {

		if (fruitsArray.length == 0) {
			return "Array is empty";
		}

		else {
			for (int i = 0; i < fruitsArray.length; i++) {
				if (fruitsArray[i].startsWith(searchValue)) {
					return "element " + fruitsArray[i] + " at index " + i + " starts with search value " + searchValue;
				}

				if (fruitsArray[i].endsWith(searchValue)) {
					return "Element " + fruitsArray[i] + " at index  " + i + " ends with search value " + searchValue;
				}
			}

		}

		return "None of the element in an Array starts or ends with search value " + searchValue;

	}

}
