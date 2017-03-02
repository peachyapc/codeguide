package codeguide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A simple process of the Hotel to count an amount of people who has
 * check in the hotel
 * 
 * @author Apichaya
 *
 */
public class Hotel {
	// TODO Write a javadoc of each attribute
	
	// TODO Complete all javadoc of each method and also the param and return type.
	
	// TODO Check full and showguest method. They have at least 1 or more mistake for
	// each method.


	/** A list name of guest in the hotel */
	// TODO Change variable name in to appropriate meaning name
	private List<String> g = new ArrayList<String>();
	/** */
	private int capacity;
	/** */
	private int balance;

	/**
	 * 
	 * @param capacity
	 */
	public Hotel(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * 
	 * @return
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * 
	 * @param name
	 */
	//TODO Reduce unnecessary line of code.
	public void addGuest(String name) {
		if (full() == true) {
			System.out.println("Cannot add people, Room is full");
		}
		g.add(name);
	}

	/**
	 * Get the amount of the guest n the hotel.
	 * @return the amount of the guest in the hotel.
	 */
	public int count() {
		return g.size();
	}

	/**
	 * 
	 * @return
	 */
	public int getBalance() {
		this.balance = capacity - count();
		return this.balance;
	}

	/**
	 * Check the capacity of the hotel is it full or not.
	 * 
	 * @return true if the hotel is full. false if not full.
	 */
	public boolean full() {
		if (g.size()>= this.capacity){return true;}
		return false;
	}

	/**
	 * 
	 */
	//TODO Make it readable.
	//TODO There are anonymous class in this method. Fix and write it to inner or outer class.
	public void ShowGuest() {
		Collections.sort(g, new Comparator<String>() {
			@Override
			public int compare(String name1, String name2) {
				return name1.compareToIgnoreCase(name2);
			}
		});
		for (String name : g) {System.out.println(name);}
	}

	/**
	 * 
	 */
	public String toString() {
		return count() + " people in the hotel, balance of room is "
				+ getBalance();
	}

}
