##codeguide
###Useful references:
*Create Descriptive Names* By Diomidis Spinellis. [Link](
http://www.informit.com/articles/article.aspx?p=2223710 )

*Commenting and Documentation and Whitespace* By Robert Sedgewick and Kevin Wayne. [Link] (
http://introcs.cs.princeton.edu/java/11style/)


###Examples
###1.Commenting and Documentation 
>*A bold comment at the beginning of each file.*

```
package work;

import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 * The Stack class represents a last-in-first-out stack of objects. 
 * @author  Joseph Bergin
 * @version 1.0, May 2000
 * Note that this version is not thread safe. 
 */
 public class Stack {...}
 ```

>*Comment every important variable name*

```
//  position x,y of the graph
private double pointX, pointY;
```


>*Comment each method with a description of what it does, its parameters, and what it returns, as well as possible errors and exceptions.*


```
/**
* Returns the object at the top of this stack without removing it. 
* @return  the object at the top of this stack. 
* @exception  NoSuchElementException  if this stack is empty.
*/
public Object peek() throws NoSuchElementException{
    int length = this.elements.size();
    if (length == 0) throw new NoSuchElementException();
    return this.elements.get(length - 1);
}
```

###2.Whitespace.

>*Use blank lines to separate your code into logical sections.*

```for(int i=0;i<n;i++)    vs.      for (int i = 0; i < n; i++)```

>*Don't put more than one statement on a line.*

```
Bad example
if(j<5){System.out.print(j);}
```

```
Good example
if (j < 5) {
    System.out.print(j);
}
```

>*Use spaces to align parallel code whenever it enhances readability.*

>*Do not put spaces before a semicolon.*




###3.Create Descriptive Names.
>*Use meaningful names that convey the purpose of the variable.*

>*Variables : A short, but meaningful*

```isPrime, mass```

>*Constant : Use all capital letters and separate internal words with the underscore character.*

```MAX_HEIGHT, CONSTANT_CURRENCY```

>*Class : A noun that communicates what the class represents.*

```class Complex, class PhoneNumber```

>*Method : A verb that communicates what the method does.*

```move (), draw (), isDrive()```


###4.Avoid returning anonymous or inner classes
>*They keep a reference to the outer instance.And they will drag that outer instance to wherevery they go, e.g. to some scope outside of your local class if you’re not careful. This can be a major source for memory leaks, as your whole object graph will suddenly entangle in subtle ways.*

>The Rule: Whenever you write an anonymous, local or inner class, 
check if you can make it static or even a regular top-level class. Avoid returning anonymous, local or inner class instances from methods to the outside scope.


```
Avoid doing this

Collections.sort(money, new Comparator<Valuable>() {
    @Override
    public int compare(Valuable o1, Valuable o2) {
	return o1.getCurrency().compareTo(o2.getCurrency());
    }			
});
```

###Exercise

[exercise](https://github.com/peachyapc/codeguide/blob/master/src/codeguide/OfficeHotel.java)
