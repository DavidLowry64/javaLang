package com.dgl.string.methods;

public class CompareExample {

	public static void main(String[] args) {
		
		compareExampleOne();
		compareExampleTwo();
		compareIgnoreCaseOne();
		compareIgnoreCaseTwo();
		
		concatenateExample();
		
	}
	
		public static void compareExampleOne() {
			String s1 = "Welcome to TTRC";
			String s2 = "Welcome to TTRC";
			String s3 = "Hello";
			String s4 = "World";
			System.out.println(s1.compareTo(s2));// 0 because both are equal
			System.out.println(s1.compareTo(s3));// -2 because "H" is 2 times lower
													// than "J"
			System.out.println(s1.compareTo(s4));// 1 because "G" is 1 times greater
													// than "H"
		}
		
		public static void compareExampleTwo() {
			String s1 = "Hello";
			String s2 = "";
			String s3 = "Hi";

			// compare with empty string, returns length of the string
			System.out.println(s1.compareTo(s2));

			// If first string is empty, result would be negative
			System.out.println(s2.compareTo(s3));
		}
		
		
		public static void compareIgnoreCaseOne() {
			String s1="HELLO WORLD";  
			String s2="hello world";  
			String s3="JAVA";  
			String s4="java";  
			System.out.println("The first string is " + s1);
			System.out.println("The second string is " + s2);
			System.out.println("Compare first String to the second string " + s1.compareToIgnoreCase(s2));
			System.out.println("The third string is " + s3);
			System.out.println("The fourth string is " + s4);
			System.out.println("Compare of the 3rd and 4th strings " + s3.compareToIgnoreCase(s4));  
		}

		// Compare different and empty strings
		public static void compareIgnoreCaseTwo() {
			String s1="hello";  
			String s2="";  
			String s3="me";  
			
			// compare with empty string, returns length of the string
			System.out.println("The first string is " + s1);
			System.out.println("The second string is actually blank empty " + s2);
			System.out.println("The third string is " + s3);			
			System.out.println("The first string to the second one " + s1.compareToIgnoreCase(s2));	
			System.out.println("The second string to the third string " + s2.compareToIgnoreCase(s3)); 
		}

		// Compare different and empty strings
		public static void concatenateExample() 
		{
		String str = "David";
		str = str.concat(" Lowry");
		System.out.println("Concatenates one String to another new String " + str);
		
		}
	

}
