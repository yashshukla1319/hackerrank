import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();
        int no = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<no;i++){
            String input = sc.nextLine();
            String phone = sc.nextLine();

            map.put(input,phone);
        }
        System.out.println(map);
        int i=0;
        while(i<no){
            String output = sc.nextLine();
            if(map.containsKey(output)){
                System.out.println(output + "=" + map.get(output));
            }
            else{
                System.out.println("Not found");
            }
            i = i+1;
        }
    }
}
