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
