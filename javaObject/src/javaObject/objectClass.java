package javaObject;

import java.util.*;
import java.io.Closeable;
import java.io.IOException;


public class objectClass {

	
	// Person class Cloneable Example

	public static class Person implements Cloneable{
		//implements Cloneable {
	//}
	     private String firstName;
	     private String lastName;

	     public String getFirstName() {
	         return firstName;
	     }

	     public void setFirstName(String firstName) {
	         this.firstName = firstName;
	     }

	     public String getLastName() {
	         return lastName;
	     }

	     public void setLastName(String lastName) {
	         this.lastName = lastName;
	     }
	     
	     @Override
		    public String toString() {
		        return "The created person's details are [firstName " + firstName + " and lastName " + lastName + "]";
		    }
	     
	     
	     public Object clone() throws CloneNotSupportedException {
		        Person person = (Person) super.clone();
		        return person;
		    }
	}
	  /*  @Override
	    public Object clone() throws CloneNotSupportedException {
	        Person person = (Person) super.clone();
	        return person;
	    }

	    @Override
	    public String toString() {
	        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	    }
	 
	  
}
*/
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
	   // Date Clone for the Obect Class
		
		  Date date = new Date();
	        System.out.println(date.toString());
	        Date date2 = (Date) date.clone();
	        System.out.println(date2.toString());
	   // Cloneable
	        
	        Person person = new Person();
	        person.setFirstName("David");
	        person.setLastName("Lowry");
	        System.out.println(person.toString());
	        Person person2 = (Person) person.clone();
	        
	        		
/*	        
	        System.out.println(person.toString());

	        Person person2 = (Person) person.clone();

	        System.out.println(person2.toString());
*/
	}
	
}