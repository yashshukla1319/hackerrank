import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger in = new BigInteger(n);
        //int in = Integer.parseInt(n);
        if(in.isProbablePrime(1) ){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}


