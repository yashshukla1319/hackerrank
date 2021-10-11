import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class StudentClass implements Comparable<StudentClass>{
    private final int id;
    private final String name;
    private final double cgpa;

    public StudentClass(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // add a comment

    /*public int getID() {
        return id;
    }*/

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public int compareTo(StudentClass student) {
        double diffCGPA = student.cgpa - this.cgpa;
        if (diffCGPA == 0D) {
            if (student.name.equals(this.name)) {
                return student.id - this.id;
            } else {
                return this.name.compareTo(student.name);
            }
        } else {
            return diffCGPA < 0 ? -1 : 1;
        }
    }

}

class Priorities {
    ArrayList<StudentClass> getStudents(ArrayList<String> events) {
        PriorityQueue<StudentClass> pq = new PriorityQueue<>();

        ArrayList<StudentClass> res = new ArrayList<>();
        String[] vals;
        String name;
        double cgpa;
        int id;
        for (String e : events) {
            vals = e.split(" ");
            if (vals.length == 4) {
                name = vals[1];
                cgpa = Double.parseDouble(vals[2]);
                id = Integer.parseInt(vals[3]);

                pq.add(new StudentClass(id, name, cgpa));
            } else {
                pq.poll();
            }
        }

        while(!pq.isEmpty()) {
            res.add(pq.poll());
        }
        return res;
    }
}



public class PriorityQueueClass {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        ArrayList<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        ArrayList<StudentClass> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (StudentClass st: students) {
                System.out.println(st.getName());
            }
        }
    }
}