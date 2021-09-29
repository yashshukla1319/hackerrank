import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNo {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int noli = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList> listArrayList = new ArrayList<>();
        for (int i = 0; i < noli; i++) {
            int noval = sc.nextInt();
            ArrayList<Integer> numberList = new ArrayList<>();
            for(int j=0;j<noval;j++){
                numberList.add((sc.nextInt()));
            }
            listArrayList.add(numberList);
            sc.nextLine();
        }
        int noquery = Integer.parseInt(sc.nextLine());
        for(int i=0;i<noquery;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<listArrayList.size() && y<listArrayList.get(x).size()){
                System.out.println(listArrayList.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
