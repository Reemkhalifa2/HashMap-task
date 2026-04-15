import java.util.Map;
import java.util.HashMap;
public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {
        //Declare a HashMap variable
        HashMap<Integer,String > employees = new HashMap<>();

        //add record to the map
        employees.put(123,"Ali");
        employees.put(124,"Reem");
        employees.put(125,"Huda");
        employees.put(126,"Nasser");
        employees.put(127,"Noor");

        //Display all elements in the HashMap
        for(Map.Entry<Integer,String > emp : employees.entrySet()){
            System.out.println("Employee ID: " + emp.getKey() + " Employee Name: " + emp.getValue());

        }

        //.Use the get() method to retrieve the employee name for one specific ID
        System.out.println(employees.get(127));
        employees.put(127, "Salma");
        System.out.println(employees.get(127));

        System.out.println(employees.get(126));
        employees.put(126, "Ahmed");
        System.out.println(employees.get(126));
        //Display the full HashMap after all updates
        System.out.println(employees);



    }
}
