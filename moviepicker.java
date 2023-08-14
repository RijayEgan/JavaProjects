import java.util.*;

public class moviepicker {
    public static void main(String[] args) {
        
        Map<String, List<String>> moviesByGenre = new HashMap<>();
        
        
        moviesByGenre.put("Action", Arrays.asList("Avengers: Endgame", "The Dark Knight", "Inception", "Mad Max: Fury Road", "John Wick"));
        moviesByGenre.put("Comedy", Arrays.asList("Pulp Fiction", "The Hangover", "Superbad", "Anchorman", "Bridesmaids"));
        moviesByGenre.put("Drama", Arrays.asList("The Shawshank Redemption", "Fight Club", "Forrest Gump", "The Godfather", "Schindler's List"));
        moviesByGenre.put("Sci-Fi", Arrays.asList("Interstellar", "The Matrix", "Blade Runner 2049", "Eternal Sunshine of the Spotless Mind", "Gravity"));
        moviesByGenre.put("Romance", Arrays.asList("Titanic", "The Notebook", "La La Land", "Before Sunrise", "Casablanca"));
        
        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Available genres: Action, Comedy, Drama, Sci-Fi, Romance");
            System.out.print("Enter your preferred genre: ");
            String genre = scanner.nextLine();
            
            
            if (moviesByGenre.containsKey(genre)) {
                List<String> movies = moviesByGenre.get(genre);
                
                
                Random random = new Random();
                String randomMovie = movies.get(random.nextInt(movies.size()));
                
                
                System.out.println("Movie Suggestion: " + randomMovie);
                
                
                String response = "";
                
                while (!response.equalsIgnoreCase("no")) {
                    System.out.print("Do you want another movie suggestion? (yes/no): ");
                    response = scanner.nextLine();
                    
                    if (response.equalsIgnoreCase("yes")) {
                        randomMovie = movies.get(random.nextInt(movies.size()));
                        System.out.println("Movie Suggestion: " + randomMovie);
                    } else if (!response.equalsIgnoreCase("no")) {
                        System.out.println("Invalid response! Please enter 'yes' or 'no'.");
                    }
                }
            } else {
                System.out.println("Invalid genre selection!");
            }
        }
        System.out.println("Thank you for using Movie Picker!");
    }
}