# hackerrank
___________________________________________________________________________________________________________
NumberFormat use .getCurrencyInstance(Local.US) and not 
                 .getNumberInstance(Local.US) if want to display currency in format with symbol like$.
___________________________________________________________________________________________________________

Calendar cal = Calendar.getInstance();
        cal.set(month, day, year);
        int ans = cal.get(Calendar.DAY_OF_WEEK);
------------------------------------------------------------------------------------------------------------
To format date and time:
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj); 
__________________________________________________________________________________________________________

substring (start,end) - output: start,end-1
 substr = str.substring(7, 17);

____________________________________________________________________________________________________________
pls remember even if the values are same then too stringbuffer are not equal.
____________________________________________________________________________________________________________
https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/autoconfigure/web/servlet/WebMvcTest.html

https://www.javatpoint.com/spring-boot-actuator

The Spring Framework provides you with some special annotations. These annotations are used to create Spring beans automatically in the application context. The main stereotype annotation is @Component.
There are some Stereotype meta-annotations which is derived from @Component those are
@Service: Used to create Spring beans at the Service layer,
@Repository: Which is used to create Spring beans for the repositories at the DAO layer, and
@Controller: Which is used to create Spring beans at the controller layer.

https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s04.html

REST (Representational State Transfer)
 
https://teletype.in/@andrewgolovko/lazy-and-eager-instantiation - Singleton Beans are eagerly instantiated
																	Prototype Beans are lazily instantiated by default
																	however, if Singleton Bean has a dependency on Prototype Bean, 
																	then Prototype Bean Instance will be created eagerly 
																	to satisfy dependencies for Singleton Bean
																	
@PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties")

Advice is associated with point-cuts.
Advice contains certain task that is to be performed when a point-cut is found. 
It defines the crosscutting behavior at join points - Types: after, before, around

for AOP - https://mossgreen.github.io/Spring-Certification-Spring-AOP/
Spring uses proxy objects to implement the method invocation interception part of AOP. 
Such proxy objects wrap the original Spring bean and intercepts method invocations as 
specified by the set of pointcuts defined by the cross cutting concern.

________________________________________________________________________________________________________
Following are various methods of Object class −

protected Object clone() - Used to create and return a copy of this object.
 boolean equals(Object obj) - Used to indicate whether some other object is "equal to" this one.
protected void finalize() - garbage collector calls this method on an object when it determines that there are no more references to the object.
Class<?> getClass() - Used to get the runtime class of this Object.
int hashCode() - Used to get a hash code value for the object.
void notify() - Used to wake up a single thread that is waiting on this object's monitor.
void notifyAll() - Used to wake up all threads that are waiting on this object's monitor.
String toString() - Used to get a string representation of the object.
void wait() - marks the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.
void wait(long timeout) - marks the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
void wait(long timeout, int nanos) - marks the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.
_________________________________________________________________________________________________________________________________________________________________________________
^	The beginning of a line.
$	The end of a line.
\b	A word boundary (where a word starts or ends, e.g. space, tab etc.).
\B	A non-word boundary.
\A	The beginning of the input.
\G	The end of the previous match.
\Z	The end of the input but for the final terminator (if any).
\z	
_________________________________________________________________________________________________________________________________________________________________
https://www.buggybread.com/2014/09/java-interview-questions-and-answers-on_59.html
________________________________________________________________________________________________________________________________________________________________________________
`Big Decimal`
The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, format conversion and hashing.
It can handle very large and very small floating point numbers with great precision but compensating with the time complexity a bit.
A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale. 
If greater than or equal to zero, the scale is the number of digits to the right of the decimal point. If less than zero, the unscaled value of the number is multiplied by 10^(-scale).
__________________________________________________________________________________________________________________________________________________________________________________________________
`Big Integer`
certainty factor - 1,0,-1

isProbablePrime(int certainty) method is used to tell if this BigInteger is probably prime or if it’s definitely composite.
This method checks for prime or composite upon the current BigInteger by which this method is called and returns a boolean value.
It returns true if this BigInteger is probably prime, false if it’s definitely composite. 
If certainty is <= 0, true is returned.
/*  obj.add(obj)
    obj.multiply(obj) methods of BigInteger */
_____________________________________________________________________________________________________________________________________________________________________________________________________
`instanceof`The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

The instanceof in java is also known as type comparison operator because it compares the instance with type. 
It returns either true or false.
_____________________________________________________________________________________________________________________________________________________________________________________________________________________
`JAVA reflection` is a very powerful tool to inspect the attributes of a class in runtime.
For example, we can retrieve the list of public fields of a class using getDeclaredMethods().
__________________________________________________________________________________________________________________________________
`Comaprable Sort` Refer this example to see how compareto method is override and used to compare elements of 
List<Student> .
_________________________________________________________________________________________________________________________________________________________
`object.cardinality` Method in Bitset class which returns Returns the number of bits set to true in this BitSet.
_______________________________________________________________________________________________________________________________________________________________________
`Java annotation` can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to instruct the compiler about the build process. 
Annotation is also used at runtime to get insight into the properties of class elements.
______________________________________________________________________________________________________________________________________________________________________________________________________
`Covariant Return Types`Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.
_________________________________________________________________________________________________________________________________________________________________________________________________________
`Varargs` The three dots (...) are used in a function’s declaration as a parameter.
These dots allow zero to multiple arguments to be passed when the function is called. The three dots are also known as var args.
_________________________________________________________________________________________________________________________________________________________________________________________________________
`Default method in Interface` default methods are implicitly public , Unlike regular interface methods, 
they are declared with the default keyword at the beginning of the method signature, and they provide an implementation.

The reason why default methods were included in the Java 8 release is pretty obvious.
In a typical design based on abstractions, where an interface has one or multiple implementations, 
if one or more methods are added to the interface, all the implementations will be forced to implement them too. 
Otherwise, the design will just break down.

Default interface methods are an efficient way to deal with this issue. They allow us to add new methods to an interface that are automatically available in the implementations.
Thus, there's no need to modify the implementing classes.
____________________________________________________________________________________________________________________________________________________________________________________________________________________
