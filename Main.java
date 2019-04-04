package com.ruth.search;

public class Main {

	public static void main(String[] args) {

		Search newSearch = new Search();
		System.out.println(newSearch.searchValue("gra"));

		RandomString randomString = new RandomString();
		System.out.println(randomString.createString());

	}
}
