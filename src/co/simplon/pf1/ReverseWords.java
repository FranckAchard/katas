package co.simplon.pf1;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence= "salut les loulous ça va";
		
		String reverseSentence="";
		String[] listWords= sentence.split(" ");
		ArrayList<String> reverseListWords= new ArrayList<String>();
		
		for (int i=listWords.length-1; i >= 0; --i) {
			reverseListWords.add(listWords[i]);
		}
		
		for (String word : reverseListWords) {
			reverseSentence+= word + " ";
		}
				
		System.out.println("[" + reverseSentence.trim() + "]");
	}

}
