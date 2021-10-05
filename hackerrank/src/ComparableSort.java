import java.util.*;
import java.util.List;

class Students {
    int id;
    String fname;
    double cgpa;
    public Students(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Students o) {
        // TODO Auto-generated method stub
        if(this.cgpa!=o.cgpa)
        {
            if(this.cgpa>o.cgpa)
                return -1;
            else
                return 1;
        }
        else if(this.fname.equals(o.fname))
        {
            return
                    Integer.compare(this.id, o.id);}
        else
        {
            if(this.fname.compareTo(o.fname)<0)
                return -1;
            else
                return 1;

        }
    }
}
public class ComparableSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Students> studentList = new ArrayList<Students>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Students st = new Students(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Comparator<Students>(){
            @Override
            public int compare(Students s1, Students s2) {
                if(s2.getCgpa()>s1.getCgpa()){
                    return 1;
                }else if(s2.getCgpa()<s1.getCgpa()){
                    return -1;
                }
                return s1.getFname().compareTo(s2.getFname());
            }
        });

        for(Students st: studentList){
            System.out.println(st.getFname());
        }
    }

}
