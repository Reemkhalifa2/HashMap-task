import java.util.Map;
import java.util.HashMap;
public class StudentMarksDemo {
    public static void main(String[] args) {
        //Declare a HashMap variable
        HashMap<Integer,Integer > students = new HashMap<>();

        //add record to the map
        students.put(123,98);
        students.put(124,69);
        students.put(125,85);
        students.put(126,79);
        students.put(127,94);

        //Display the HashMap
        System.out.println(students);
        //Use get() to display the mark of one specific student
        System.out.println(students.get(127));
        //Use containsKey() to check whether a specific student ID exists
        System.out.println(students.containsKey(124));

        //Update the mark of one student using put() with the same key
        students.put(123,88);
        //Display the updated HashMap
        System.out.println(students);

        //Use remove() to delete one student record
        students.remove(126);
        System.out.println(students);

        // size() to display the total number of student records
        System.out.println(students.size());





    }
}
