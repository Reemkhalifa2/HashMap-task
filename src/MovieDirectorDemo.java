import java.util.HashMap;

public class MovieDirectorDemo {
    public static void main(String[] args) {

        // Declare a HashMap
        HashMap<String, String> movieDirectorHashMap = new HashMap<>();

        // 2. Add movie-director records
        movieDirectorHashMap.put("Inception", "Christopher Nolan");
        movieDirectorHashMap.put("Titanic", "James Cameron");
        movieDirectorHashMap.put("Avatar", "James Cameron");
        movieDirectorHashMap.put("The Avengers", "Joss Whedon");
        movieDirectorHashMap.put("Jurassic Park", "Steven Spielberg");

        // Display the HashMap
        System.out.println(movieDirectorHashMap);

        // Get the director of a specific movie
        System.out.println(movieDirectorHashMap.get("Inception"));

        //Check if a movie exists
        System.out.println(movieDirectorHashMap.containsKey("Titanic"));

        //Check a movie that does NOT exist
        System.out.println(movieDirectorHashMap.containsKey("Frozen"));

        //Update the director of a movie
        movieDirectorHashMap.put("The Avengers", "Updated Director");

        //Display updated HashMap
        System.out.println(movieDirectorHashMap);

        //Remove a movie record
        movieDirectorHashMap.remove("Avatar");

        //Display HashMap after removal
        System.out.println(movieDirectorHashMap);

        //Display total number of records
        System.out.println(movieDirectorHashMap.size());
    }
}