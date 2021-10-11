
import java.util.BitSet;
import java.util.Scanner;

public class BitSetClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int length = sc.nextInt();
        BitSet b1 = new BitSet(size);
        BitSet b2 = new BitSet(size);
        for(int i=0;i<length;i++){
            String val = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch(val){
                case "AND":
                    if(x==1){
                    b1.and(b2);}
                    else{
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if(x==1){
                    b1.or(b2);}
                    else{
                        b2.and(b1);
                    }
                    break;
                case "SET":
                    if(x==1){
                    b1.set(y);}
                    else {
                        b2.set(y);
                    }
                    break;
                case "FLIP":
                    if(x==1){
                    b1.flip(y);}
                    else {
                        b2.flip(y);
                    }
                    break;
                case "XOR":
                    if(x==1){
                    b1.xor(b2);}
                    else{b2.xor(b1);}
                    break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }

    }
}
