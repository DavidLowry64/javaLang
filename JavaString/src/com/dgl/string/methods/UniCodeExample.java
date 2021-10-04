package com.dgl.string.methods;

public class UniCodeExample {

	public static void main(String[] args) {
				
		String str = "Source Code Example Library";
		int unicode = str.codePointAt(0);
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);

		// Unicode conversion example
		String myString = "\u0048\u0065\u006C\u006C\u006F World";
		System.out.println("The example to convert unicode into a word " + myString);
		
		// Code Before Example
		int unicodeBefore = str.codePointBefore(11);
		System.out.println("Unicode code point before ndex number " + unicodeBefore);
		
		// The length of the string and count at a specific interval
		System.out.println("length of the string :: " + str.length());
		int unicodePoint = str.codePointCount(10, str.length());
		System.out.println("Unicode code point at index  " + unicodePoint);

	
	
	
	}

}
