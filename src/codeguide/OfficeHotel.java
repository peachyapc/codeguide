package codeguide;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
public class OfficeHotel {

	/**
	 * A simple process of the Hotel to count an amount of people who has
	 * check in the hotel
	 * 
	 * @author Apichaya
	 *
	 */
		// TODO Write a javadoc of each attribute
		
		// TODO Complete all javadoc of each method and also the param and return type.
		
		// TODO Check showguest method. It has 1 mistake, fix it.


		/** A list name of guest in the hotel */
		// TODO Change variable name in to appropriate meaning name
		private List<String> g = new ArrayList<String>();
		/** How many room in the Hotel*/
		private int countRoom;
		/** */
		private int amountOfGuest;

		/**
		 * Input a capacity of hotel room.
		 * @param countRoom is a capacity of the room in the hotel.
		 */
		public OfficeHotel(int countRoom) {
			this.countRoom = countRoom;
		}

		/**
		 * 
		 * @param name
		 */
		//TODO Reduce unnecessary line of code.
		public void addGuest(String name) {
			if (isRoomFree() == true) {
				System.out.println("Cannot add people, Room is full");
			}
			g.add(name);
		}

		/**
		 * Get the amount of the guest in the hotel.
		 * @return the amount of the guest in the hotel.
		 */
		public int count() {
			return g.size();
		}

		/**
		 * 
		 * @return
		 */
		public int getAmountOfGuest() {
			this.amountOfGuest = countRoom - count();
			return this.amountOfGuest;
		}

		/**
		 * Check the capacity of rom in the hotel is it full or not.
		 * 
		 * @return true if the room in the hotel is full. false if not full.
		 */
		//TODO Make the code readable.
		public boolean isRoomFree() {
			if (g.size()>= this.countRoom){return true;}
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
			for (int i = 0; i < g.size(); i++) {
				System.out.println(g.get(i));
			}
		}

		/**
		 * 
		 */
		public String toString() {
			return count() + " people in the hotel, balance of room is "
					+ getAmountOfGuest();
		}

	}

