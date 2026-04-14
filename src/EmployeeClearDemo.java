import java.util.Map;
import java.util.HashMap;
public class EmployeeClearDemo {
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

        //.Use the size() method to get the size of the map
        System.out.println("The size of the Employee map :" + employees.size());

        //clear() method to remove all elements from the map
        employees.clear();
        System.out.println(employees);
        System.out.println("The size of the Employee map :" + employees.size());




    }
}
