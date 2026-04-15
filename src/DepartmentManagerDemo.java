import java.util.HashMap;

public class DepartmentManagerDemo {
    public static void main(String[] args) {

        // Declare a HashMap
        HashMap<String, String> departmentMap = new HashMap<>();

        //Add department-manager records
        departmentMap.put("HR", "Ali ");
        departmentMap.put("IT", "Reem");
        departmentMap.put("Finance", "Huda");
        departmentMap.put("Marketing", "Nasser");
        departmentMap.put("Operations", "Noor");

        //Display all elements in the HashMap
        System.out.println(departmentMap);

        // Get the manager of a specific department
        System.out.println(departmentMap.get("IT"));

        //Check if a department exists
        System.out.println(departmentMap.containsKey("Finance"));

        //Check a department that does NOT exist
        System.out.println(departmentMap.containsKey("Legal"));

        //Update the manager of a department
        departmentMap.put("Marketing", "Ahmed");

        //Display updated HashMap
        System.out.println(departmentMap);

        //Remove a department record
        departmentMap.remove("Operations");

        //Display HashMap after removal
        System.out.println(departmentMap);

        //Display total number of records
        System.out.println(departmentMap.size());
    }
}