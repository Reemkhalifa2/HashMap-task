import java.util.Map;
import java.util.HashMap;
public class ProductPriceDemo {
    public static void main(String[] args) {
        //Declare a HashMap variable
        HashMap<String,Double > products = new HashMap<>();

        //add record to the map
        products.put("Laptop",350.4);
        products.put("Camera",125.5);
        products.put("Smart watch",86.5);
        products.put("key board",5.3);
        products.put("Smart phone",40.0);

        //Display the HashMap
        System.out.println(products);
        //Use get() to display the price of one specific product
        System.out.println(products.get("Laptop"));
        //Use containsKey() to check whether one product name exists
        System.out.println(products.containsKey("Camera"));

        //Update the mark of one student using put() with the same key
        products.put("Smart phone",400.0);
        //Display the updated HashMap
        System.out.println(products);

        //Use remove() to delete one record
        products.remove("Smart phone");
        System.out.println(products);

        // size() to display the total number of  records
        System.out.println(products.size());





    }
}
