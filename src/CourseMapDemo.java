import java.util.HashMap;

public class CourseMapDemo {
    public static void main(String[] args) {

        //Declare a HashMap
        HashMap<String, String> courses= new HashMap<>();

        //Add course records using put()
        courses.put("CS101", "Introduction to Programming");
        courses.put("CS102", "Data Structures");
        courses.put("CS201", "Object-Oriented Programming");
        courses.put("CS202", "Database Systems");
        courses.put("CS301", "Operating Systems");

        //Display all elements in the HashMap
        System.out.println(courses);

        //Get the name of a specific course using its code
        System.out.println(courses.get("CS102"));

        // Check if a course code exists
        System.out.println(courses.containsKey("CS201"));

        //Check a course code that does NOT exist
        System.out.println(courses.containsKey("CS999"));

        //Update the name of a course (same key)
        courses.put("CS202", "Advanced Database Systems");

        //Display updated HashMap
        System.out.println(courses);

        //Remove a course record
        courses.remove("CS301");

        //Display HashMap after removal
        System.out.println(courses);

        /* Display total number of records */
        System.out.println(courses.size());
    }
}