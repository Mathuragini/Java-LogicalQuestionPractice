package com.java.ques;

public class RemoveJunk {
	
	public static void main(String [] args) {
		String word = "%%778hdhn!!##jff0ffjs//)5$";
		
		word = word.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(word);
	}

}
