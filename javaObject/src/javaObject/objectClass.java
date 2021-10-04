package javaObject;

import java.util.*;
import java.io.Closeable;
import java.io.IOException;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class objectClass {

	
	public static class ObjectNotify {
		 private List<String> synchedList;

		 
		 public ObjectNotify() {
			  // create a new synchronized list to be used
			  synchedList = Collections.synchronizedList(new LinkedList<>());
			 }
		 

		 // method used to remove an element from the list
		 public String removeElement() throws InterruptedException {
		  synchronized (synchedList) {

		   // while the list is empty, wait
		   while (synchedList.isEmpty()) {
		    
		    System.out.println("List is empty...");
		    
		    synchedList.wait();
		    
		    System.out.println("Waiting...");
		   }
		   String element = synchedList.remove(0);

		   return element;
		  }
		 }

		 // method to add an element in the list
		 public void addElement(String element) {
		  System.out.println("Opening...");
		  synchronized (synchedList) {

		   // add an element and notify all that an element exists
		   synchedList.add(element);
		   
		   System.out.println("New Element added:'" + element + "'");

		   synchedList.notifyAll();
		   System.out.println("notifyAll called!");
		  }
		  
		  System.out.println("Closing in AddElement method...");
		 }
	}

	
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

	     // The get Hashcode code source
	     @Override
	     public int hashCode() {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	      result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	      return result;
	     }
	     
	     
	  // This method is called just before an object is garbage collected
	     @Override
	     protected void finalize() throws Throwable {
	        
	         super.finalize();
	
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
	        
	        // Adding the finalize method
	        System.out.println("Before Finalize");
	        try {
	            person.finalize();
	        } catch (Throwable e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("After Finalize");

	        // The class of the object
	        System.out.println("The Class for the first Person Object created " + person.getClass());
	        
	      // Person One Hashcode
	        System.out.println("The initial Person hashcode " + personOne.hashCode());
	        
	     // Person Two Hashcode
	        System.out.println("The second Person hashcode " + personTwo.hashCode());
	      
	        // Notify Example
	        
	        final ObjectNotify demo = new ObjectNotify();
	        

	        Runnable runA = () -> {

	         try {
	          String item = demo.removeElement();
	          System.out.println("" + item);
	         } catch (InterruptedException ix) {
	          System.out.println("Interrupted Exception!");
	         } catch (Exception x) {
	          System.out.println("Exception thrown.");
	         }
	        };
	        
	        Runnable runB = () -> {
	         // run adds an element in the list and starts the loop
	         demo.addElement("Hello!");
	        };
	        
	        
	        try {
	        	   Thread threadA1 = new Thread(runA, "A");
	        	   threadA1.start();

	        	   Thread.sleep(500);

	        	   Thread threadA2 = new Thread(runA, "B");
	        	   threadA2.start();

	        	   Thread.sleep(500);

	        	   Thread threadB = new Thread(runB, "C");
	        	   threadB.start();

	        	   Thread.sleep(1000);

	        	   threadA1.interrupt();
	        	   threadA2.interrupt();
	        	  } catch (InterruptedException x) {
	        	  }
	        	 }
	        
	        
	        
	
	
}