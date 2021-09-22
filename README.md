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
