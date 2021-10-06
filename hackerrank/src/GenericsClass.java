import java.lang.reflect.Method;

class Print{
public static<E> void printArray(E[] inputArray){
    for (E element : inputArray){
        System.out.println(element);
    }
}
}
public class GenericsClass {
    public static void main( String args[] ) {
        Print  myPrinter = new Print();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Print.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }

}
