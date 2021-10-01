
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntMulti {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = sc.nextLine();
        String b = sc.nextLine();

        //String n = bufferedReader.readLine();
        BigInteger bia = new BigInteger(a);
        BigInteger bib = new BigInteger(b);
        System.out.println(bia.add(bib));
        System.out.println(bia.multiply(bib));

    }
}
