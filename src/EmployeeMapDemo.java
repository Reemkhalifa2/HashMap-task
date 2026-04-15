import java.util.Map;
import java.util.HashMap;
public class EmployeeMapDemo {
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
        // Get the name of employee
        System.out.println(employees.get(126));

        //Check if  employee exists
        System.out.println(employees.containsKey(125));

        //Check employee that does NOT exist
        System.out.println(employees.containsKey(129));

        employees.put(127,"Sama");
        System.out.println(employees);

        employees.remove(125);
        System.out.println(employees);
        //.Use the size() method to get the size of the map
        System.out.println("The size of the Employee map :" + employees.size());



    }
}
