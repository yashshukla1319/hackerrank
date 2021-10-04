import java.util.Scanner;

class MyCalculatorE{
    public static int power(int n, int p) throws Exception{
        if(n<0 && p<0){ throw new Exception("n and p should be non-negative");}
        else if (n == 0 && p == 0){ throw new Exception("n and p should not be zero.");}
        return (int)Math.pow(n, p);
    }
}
public class ExceptionValidate extends Throwable {


    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        final MyCalculatorE calculator = new MyCalculatorE();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
