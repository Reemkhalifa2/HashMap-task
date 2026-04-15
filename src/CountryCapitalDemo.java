import java.util.Map;
import java.util.HashMap;
public class CountryCapitalDemo {
    public static void main(String[] args) {
        //Declare a HashMap variable
        HashMap<String,String > countries = new HashMap<>();

        //add record to the map
        countries.put("Oman","Muscat");
        countries.put("KSA","Riyad");
        countries.put("UAE","Abu Dhabi");
        countries.put("Kuwait","Kuwait");
        countries.put("Qatar","qatar");

        //Display the HashMap
        System.out.println(countries);
        //Use get() to display the capital of one specific country
        System.out.println(countries.get("Oman"));
        //11.Use containsKey() to check whether one country name exists
        System.out.println(countries.containsKey("UAE"));

        //Update the capital of one country using put() with the same key
        countries.put("Qatar","Al Doha");
        //Display the updated HashMap
        System.out.println(countries);

        //Use remove() to delete one record
        countries.remove("UAE");
        System.out.println(countries);

        // size() to display the total number of  records
        System.out.println(countries.size());





    }
}
