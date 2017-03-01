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

   ```  /**
         * Get the total value of all items in the purse.
         *
         *@return the total value of items in the purse.
         */
	     public double getBalance() {
	         double balance = 0;
	         for (Valuable valuable : money) {
	             balance += valuable.getValue();
                 }
	         return balance;
	     }   ```


###2.Whitespace.

>*Use blank lines to separate your code into logical sections.*

>*Don't put more than one statement on a line.*

>*Use spaces to align parallel code whenever it enhances readability.*

```for(int i=0;i<n;i++)    vs.      for (int i = 0; i < n; i++)```


###3.Create Descriptive Names.
>*Use meaningful names that convey the purpose of the variable.*

>*Variables : A short, but meaningful*

```isPrime, mass```

>*Constant : Use all capital letters and separate internal words with the underscore character.*

```MAX_HEIGHT, CONSTANT_CURRENCY```

>*Class : A noun that communicates what the class represents.*

```class Complex, class PhoneNumber```

>*Method : A verb that communicates what the method does.*

```move (), draw ()```
