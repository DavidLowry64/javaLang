package com.dgl.string.methods;

public class UniCodeExample {

	public static void main(String[] args) {
				
		String str = "Source Code Example Library";
		int unicode = str.codePointAt(0);
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);

		String myString = "\u0048\u0065\u006C\u006C\u006F World";
		System.out.println("The example to convert unicode into a word " + myString);
		
	}

}
