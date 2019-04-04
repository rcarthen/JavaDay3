package com.ruth.search;

import java.util.Random;

public class RandomString {
	
	public StringBuffer createString (){
		
		StringBuffer stringBuffer = new StringBuffer ();
		
		String characters = "abcdefghjk";

		String randomString = "";
		

	int length = 5;
	
	//Instantiating the Random Object
	Random rand= new Random();
	
	///in order to get the characters all together bunched up and to access them creating an array of character type
char[] text = new char [length];
	

	
	///a for loop to add each individual random character to the array we created to each index
	
for (int j=0; j<10; j++) { 
	randomString = "";
	for(int i = 0; i < length;i++) {
		
		
		///set the characters for each array 
	
		text[i] = characters.charAt(rand.nextInt(characters.length()));
		randomString += text[i];
		
	}
	
    stringBuffer.append(randomString);
    stringBuffer.append(" ");
	
	}

      return (stringBuffer);
	}
	
	

}
