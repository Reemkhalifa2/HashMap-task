import java.util.Map;
import java.util.HashMap;
public class EmployeeKeyLoopDemo {
    public static void main(String[] args) {
        //Declare a HashMap variable
        HashMap<Integer,String > employees = new HashMap<>();
        //add record to the map
        employees.put(123,"Ali");
        employees.put(124,"Reem");
        employees.put(125,"Huda");
        employees.put(126,"Nasser");
        employees.put(127,"Noor");
        //display the full hash map
        System.out.println(employees);
        //a loop to go through each key
        for(Integer emp : employees.keySet()){
            //get() to display the value for each key
            System.out.println("ID: " + emp + " Employee Name: " + employees.get(emp));

        }
        employees.put(128,"Ahmed");
        //a loop to go through each key
        for(Integer emp : employees.keySet()){
            //get() to display the value for each key
            System.out.println("ID: " + emp + " Employee Name: " + employees.get(emp));

        }

    }
}
