##codeguide
###Useful references:
*Create Descriptive Names* By Diomidis Spinellis. [Link](
http://www.informit.com/articles/article.aspx?p=2223710 )

*Commenting and Documentation and Whitespace* By Robert Sedgewick and Kevin Wayne. [Link] (
http://introcs.cs.princeton.edu/java/11style/)


###Examples
###1.Commenting and Documentation 
>*Comment every important variable name*

>*Comment each method with a description of what it does, its parameters, and what it returns, as well as possible errors and exceptions.*

>*Include a bold comment at the beginning of each file.*

     ```/**<br>
         * Get the total value of all items in the purse.<br>
	 * <br>
	 * @return the total value of items in the purse.<br>
	 */<br>
	public double getBalance() {<br>
	    double balance = 0;<br>
	    for (Valuable valuable : money) {<br>
		balance += valuable.getValue();	<br>				      	    }	<br>							                    return balance;<br>								}```


