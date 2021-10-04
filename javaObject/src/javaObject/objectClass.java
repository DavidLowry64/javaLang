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
	     
	     @Override
	     public boolean equals(Object obj) {
	        if (this == obj)
	           return true;
	        if (obj == null)
	           return false;
	        if (getClass() != obj.getClass())
	           return false;
	        Person other = (Person) obj;
	        if (firstName == null) {
	           if (other.firstName != null)
	              return false;
	        } else if (!firstName.equals(other.firstName))
	              return false;
	        if (lastName == null) {
	           if (other.lastName != null)
	              return false;
	        } else if (!lastName.equals(other.lastName))
	              return false;
	        return true;
	     }
	     
	     public Object clone() throws CloneNotSupportedException {
		        Person person = (Person) super.clone();
		        return person;
		    }
	}
	  	
	
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
	        
	        // Equals Comparative Operator 
	        Person personOne = new Person();
	        personOne.setFirstName("David");
	        personOne.setLastName("Lowry");

	        Person personTwo = new Person();
	        personTwo.setFirstName("David");
	        personTwo.setLastName("Lowry");

	        boolean hasEqual = personOne.equals(personTwo);
	        System.out.println("And the results from the comparision are " + hasEqual);
	        
	}
	
}