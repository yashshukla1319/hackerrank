import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class List  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String insert = "Insert";
        String delete = "Delete";
        int no = sc.nextInt();
        LinkedList list = new LinkedList<Integer>();
        for (int i = 0; i < no; i++) {
            list.add(sc.nextInt());

        }
        int query = sc.nextInt();
        for (int i=0;i <query;i++){
            String input = sc.nextLine();
            if(input.equals(insert)){
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index,value);
            }
            if(input.equals(delete)){
                int ind = sc.nextInt();
                list.remove(ind);
            }
        }
        System.out.println(list);
    }
}
