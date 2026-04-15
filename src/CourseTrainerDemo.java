import java.util.HashMap;
public class CourseTrainerDemo {
    public static void main(String[] args) {

        // Declare a HashMap
        HashMap<String, String> CourseTrainerHashMap = new HashMap<>();

        // Add records
        CourseTrainerHashMap.put("Java", "Mohammed");
        CourseTrainerHashMap.put("Database", "Alice");
        CourseTrainerHashMap.put("Data science", "Sonia");
        CourseTrainerHashMap.put("Python", "Ahmed");
        CourseTrainerHashMap.put("Math", "Rania");

        // Display the HashMap
        System.out.println(CourseTrainerHashMap);
        //Use get() to display the trainer of one specific course
        System.out.println(CourseTrainerHashMap.get("Java"));
        // Use containsKey() to check whether one course name exists
        System.out.println(CourseTrainerHashMap.containsKey("Math"));
        //Use containsKey() again to check a course name that does not exist
        System.out.println(CourseTrainerHashMap.containsKey("Hardware"));
        // Update trainer
        CourseTrainerHashMap.put("Python", "Salma");

        // Display updated map
        System.out.println(CourseTrainerHashMap);

        // Remove a book
        CourseTrainerHashMap.remove("Math");
        System.out.println(CourseTrainerHashMap);

        // Display size
        System.out.println(CourseTrainerHashMap.size());
    }
}