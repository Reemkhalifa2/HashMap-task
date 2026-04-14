import java.util.Map;
import java.util.HashMap;
public class EmployeeRemoveDemo {
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

        //.Use the remove() method to remove the employee specific ID
        employees.remove(127);
        System.out.println(employees);

        employees.remove(123);
        System.out.println(employees);
        //remove an ID that does not exist
        employees.remove(145);//delete




    }
}
