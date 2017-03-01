##codeguide
###Useful references:
*Create Descriptive Names* By Diomidis Spinellis.
http://www.informit.com/articles/article.aspx?p=2223710
*Commenting and Documentation and Whitespace* By Robert Sedgewick and Kevin Wayne.
http://introcs.cs.princeton.edu/java/11style/


###Examples
###1.Commenting and Documentation 
-*Comment every important variable name*
-*Comment each method with a description of what it does, its parameters, and what it returns, as well as possible errors and exceptions.*
-*Include a bold comment at the beginning of each file.*

'''	/**
	 * Get the total value of all items in the purse.
	 	 * 
		 	 * @return the total value of items in the purse.
			 	 */
				 	public double getBalance() {
							double balance = 0;
									for (Valuable valuable : money) {
												balance += valuable.getValue();
														}
																return balance;
																	} '''


