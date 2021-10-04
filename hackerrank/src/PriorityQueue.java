/*import java.util.ArrayList;
import java.util.Scanner;

class Students{
    String name = new String();
    double cgpa;
    int id;
    Students(int id,String name,double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCGPA(){
        return cgpa;
    }
}
class Priorities{
    public ArrayList<Student> getStudents(ArrayList<String> events)
    {
        int n = events.size();
        PriorityQueue pq = new PriorityQueue();
        for(String i:events)
        {
            String[] s = new String[4];
            s = i.split("\\s");
            if(s.length>1)
            {
                pq.add(new Students(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));
            }
            else
            {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Students>(pq);
    }
}

public class PriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        ArrayList<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        ArrayList<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
*/