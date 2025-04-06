import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();

        
        students.put(101, "Luic");
        students.put(102, "Barbie");
        students.put(103, "John");
        students.put(104, "Adam");
        students.put(105, "Mukesh");

      
        int enrollmentNo = 103;
        if (students.containsKey(enrollmentNo)) {
            System.out.println("Student with enrollment number " + enrollmentNo + " is: " + students.get(enrollmentNo));
        } else {
            System.out.println("Student not found with enrollment number " + enrollmentNo);
        }
    }
}
