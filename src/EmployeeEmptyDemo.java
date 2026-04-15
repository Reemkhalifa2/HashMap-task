import java.util.Map;
import java.util.HashMap;
public class EmployeeEmptyDemo {
    public static void main(String[] args) {
        //Declare a HashMap variable
        HashMap<Integer,String > employees = new HashMap<>();
        //Check if the HashMap is empty
        System.out.println("Is the map empty: " + employees.isEmpty());

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
        System.out.println("Is the map empty: " + employees.isEmpty());
        //remove all records
        employees.clear();
        System.out.println(employees);
        System.out.println("Is the map empty: " + employees.isEmpty());


    }
}
