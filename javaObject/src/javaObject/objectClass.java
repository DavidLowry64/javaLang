package javaObject;

import java.util.*;

public class objectClass {

	public static void main(String[] args) {
	   // Date Clone for the Obect Class
		
		  Date date = new Date();
	        System.out.println(date.toString());
	        Date date2 = (Date) date.clone();
	        System.out.println(date2.toString());

	}

}
