import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i=0;i<no;i++){
            String input = sc.nextLine();
            int phone = sc.nextInt();
            HashMap<Integer,String> map = new HashMap<>();
            map.put(phone,input);
        }
    }
}
