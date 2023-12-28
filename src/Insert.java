import java.util.Scanner;

public class Insert {
   public static void main(String[] args) {
    Scanner userinsert = new Scanner(System.in);

    System.out.println("Which movie you want to search?");
    String movie = userinsert.nextLine();
    
    System.out.println("Year of release?");
    int year = userinsert.nextInt();

    System.out.println("What do you think about this movie?");
    double review = userinsert.nextDouble();

    String resume = """
        your movie is %s.
        released in %d.
        your review was %.1f
        """.formatted(movie,year,review);
    System.out.println(resume);
   } 
}
