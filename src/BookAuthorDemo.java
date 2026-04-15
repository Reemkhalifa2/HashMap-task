import java.util.HashMap;

public class BookAuthorDemo {
    public static void main(String[] args) {

        // Declare a HashMap
        HashMap<String, String> bookAuthorHashMap = new HashMap<>();

        // Add records
        bookAuthorHashMap.put("Harry Potter", "J.K. Rowling");
        bookAuthorHashMap.put("1984", "George Orwell");
        bookAuthorHashMap.put("Pride and Prejudice", "Jane Austen");
        bookAuthorHashMap.put("Tom Sawyer", "Mark Twain");
        bookAuthorHashMap.put("Murder on the Orient Express", "Agatha Christie");

        // Display the HashMap
        System.out.println(bookAuthorHashMap);
        // Get author of a specific book
        System.out.println(bookAuthorHashMap.get("1984"));
        // Check if a book exists
        System.out.println(bookAuthorHashMap.containsKey("Harry Potter"));

        // Update author
        bookAuthorHashMap.put("1984", "George Orwell Updated");

        // Display updated map
        System.out.println(bookAuthorHashMap);

        // Remove a book
        bookAuthorHashMap.remove("Tom Sawyer");
        System.out.println(bookAuthorHashMap);

        // Display size
        System.out.println(bookAuthorHashMap.size());
    }
}