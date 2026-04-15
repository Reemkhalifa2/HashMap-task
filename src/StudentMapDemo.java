import java.util.HashMap;

public class StudentMapDemo {
    public static void main(String[] args) {

        //Declare a HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add student records using put()
        studentMap.put(101, "Ali");
        studentMap.put(102, "Reem");
        studentMap.put(103, "Huda");
        studentMap.put(104, "Nasser");
        studentMap.put(105, "Noor");

        //Display all students
        System.out.println(studentMap);

        // Get a specific student by ID
        System.out.println(studentMap.get(102));

        //Check if a student ID exists
        System.out.println(studentMap.containsKey(103));

        //Check a non-existing student ID
        System.out.println(studentMap.containsKey(109));

        // Update a student name (same key)
        studentMap.put(104, "Ahmed");

        //Display updated map
        System.out.println(studentMap);
        // Remove a student
        studentMap.remove(105);
        //Display after removal
        System.out.println(studentMap);

        //Display total number of students
        System.out.println(studentMap.size());
    }
}